package com.fidesmo.sec.core.models;

import android.os.Build;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.fidesmo.sec.core.BuildConfig;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000b¨\u0006%"}, d2 = {"Lcom/fidesmo/sec/core/models/ClientInfo;", "", "applicationName", "", "applicationVersion", "clientCapabilities", "", "Lcom/fidesmo/sec/core/models/ClientCapabilities;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "androidApiLevel", "getAndroidApiLevel", "()Ljava/lang/String;", "getApplicationName", "getApplicationVersion", "capabilities", "getCapabilities", "()Ljava/util/List;", "getClientCapabilities", "clientType", "getClientType", "description", "getDescription", "deviceModel", "getDeviceModel", "sdkVersion", "getSdkVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ClientInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<ClientCapabilities> defaultCapabilities = CollectionsKt__CollectionsKt.listOf((Object[]) new ClientCapabilities[]{ClientCapabilities.SeAccess, ClientCapabilities.PaymentAidAccess, ClientCapabilities.App2app, ClientCapabilities.Support3ds});
    private final transient String androidApiLevel;
    private final transient String applicationName;
    private final transient String applicationVersion;
    private final List<String> capabilities;
    private final transient List<ClientCapabilities> clientCapabilities;
    private final transient String clientType;
    private final String description;
    private final transient String deviceModel;
    private final transient String sdkVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientInfo(String str, String str2, List<? extends ClientCapabilities> list) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.applicationName = str;
        this.applicationVersion = str2;
        this.clientCapabilities = list;
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        this.androidApiLevel = valueOf;
        String str3 = Build.MODEL;
        str3 = str3 == null ? "" : str3;
        this.deviceModel = str3;
        this.sdkVersion = BuildConfig.VERSION_NAME;
        this.clientType = "android";
        this.description = "android/" + valueOf + ';' + str + '/' + str2 + '/' + BuildConfig.VERSION_NAME + ';' + str3;
        List<? extends ClientCapabilities> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ClientCapabilities) it.next()).getValue());
        }
        this.capabilities = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClientInfo copy$default(ClientInfo clientInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientInfo.applicationName;
        }
        if ((i & 2) != 0) {
            str2 = clientInfo.applicationVersion;
        }
        if ((i & 4) != 0) {
            list = clientInfo.clientCapabilities;
        }
        return clientInfo.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApplicationVersion() {
        return this.applicationVersion;
    }

    public final List<ClientCapabilities> component3() {
        return this.clientCapabilities;
    }

    public final ClientInfo copy(String applicationName, String applicationVersion, List<? extends ClientCapabilities> clientCapabilities) {
        applicationName.getClass();
        applicationVersion.getClass();
        clientCapabilities.getClass();
        return new ClientInfo(applicationName, applicationVersion, clientCapabilities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) other;
        return Intrinsics.areEqual(this.applicationName, clientInfo.applicationName) && Intrinsics.areEqual(this.applicationVersion, clientInfo.applicationVersion) && Intrinsics.areEqual(this.clientCapabilities, clientInfo.clientCapabilities);
    }

    public final String getAndroidApiLevel() {
        return this.androidApiLevel;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final String getApplicationVersion() {
        return this.applicationVersion;
    }

    public final List<String> getCapabilities() {
        return this.capabilities;
    }

    public final List<ClientCapabilities> getClientCapabilities() {
        return this.clientCapabilities;
    }

    public final String getClientType() {
        return this.clientType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        return this.clientCapabilities.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.applicationName.hashCode() * 31, 31, this.applicationVersion);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientInfo(applicationName=");
        sb.append(this.applicationName);
        sb.append(", applicationVersion=");
        sb.append(this.applicationVersion);
        sb.append(", clientCapabilities=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, (List) this.clientCapabilities, ')');
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/fidesmo/sec/core/models/ClientInfo$Companion;", "", "()V", "defaultCapabilities", "", "Lcom/fidesmo/sec/core/models/ClientCapabilities;", "getDefaultCapabilities", "()Ljava/util/List;", "defaultClientInfo", "Lcom/fidesmo/sec/core/models/ClientInfo;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientInfo defaultClientInfo() {
            return new ClientInfo(null, null, null, 7, null);
        }

        public final List<ClientCapabilities> getDefaultCapabilities() {
            return ClientInfo.defaultCapabilities;
        }

        private Companion() {
        }
    }

    public ClientInfo() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ ClientInfo(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? defaultCapabilities : list);
    }
}
