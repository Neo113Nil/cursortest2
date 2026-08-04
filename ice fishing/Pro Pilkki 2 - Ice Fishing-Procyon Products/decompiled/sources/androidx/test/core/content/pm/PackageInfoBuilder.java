package androidx.test.core.content.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.test.internal.util.Checks;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PackageInfoBuilder {
    private ApplicationInfo applicationInfo;
    private String packageName;
    private String versionName;
    private long longVersionCode = 0;
    private final Map<String, Integer> requestedPermissionsMap = new HashMap();

    private PackageInfoBuilder() {
    }

    public static PackageInfoBuilder newBuilder() {
        return new PackageInfoBuilder();
    }

    public PackageInfoBuilder setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public PackageInfoBuilder setVersionCode(long longVersionCode) {
        this.longVersionCode = longVersionCode;
        return this;
    }

    public PackageInfoBuilder setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    public PackageInfoBuilder addRequestedPermission(String requestedPermission, int requestedPermissionFlag) {
        this.requestedPermissionsMap.put(requestedPermission, Integer.valueOf(requestedPermissionFlag));
        return this;
    }

    public PackageInfoBuilder setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }

    public PackageInfo build() {
        Checks.checkNotNull(this.packageName, "Mandatory field 'packageName' missing.");
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = this.packageName;
        packageInfo.versionName = this.versionName;
        if (Build.VERSION.SDK_INT >= 28) {
            packageInfo.setLongVersionCode(this.longVersionCode);
        } else {
            packageInfo.versionCode = (int) this.longVersionCode;
        }
        if (this.applicationInfo == null) {
            this.applicationInfo = ApplicationInfoBuilder.newBuilder().setPackageName(this.packageName).build();
        }
        packageInfo.applicationInfo = this.applicationInfo;
        packageInfo.requestedPermissions = (String[]) this.requestedPermissionsMap.keySet().toArray(new String[0]);
        Integer[] numArr = (Integer[]) this.requestedPermissionsMap.values().toArray(new Integer[0]);
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        packageInfo.requestedPermissionsFlags = iArr;
        Checks.checkState(packageInfo.packageName.equals(packageInfo.applicationInfo.packageName), "Field 'packageName' must match field 'applicationInfo.packageName'");
        return packageInfo;
    }
}
