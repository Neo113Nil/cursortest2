package com.google.crypto.tink.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Trace;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.AutoValue_LibraryVersion;
import com.squareup.preferences.SharedPreferencesKeyValue;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class PrimitiveRegistry$$ExternalSyntheticLambda0 implements ComponentFactory, SharedPreferencesKeyValue.Writer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ PrimitiveRegistry$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(zzlj zzljVar) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        String str = (String) this.f$0;
        switch (i) {
            case 1:
                Context context = (Context) zzljVar.get(Context.class);
                int i2 = ((MacWrapper$$ExternalSyntheticLambda0) obj).$r8$classId;
                String str2 = "";
                switch (i2) {
                    case 26:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case 27:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            str2 = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        break;
                    case 28:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str2 = "embedded";
                                        break;
                                    }
                                } else {
                                    str2 = "auto";
                                    break;
                                }
                            } else {
                                str2 = "watch";
                                break;
                            }
                        } else {
                            str2 = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str2 = FirebaseCommonRegistrar.safeValue(installerPackageName);
                            break;
                        }
                        break;
                }
                return new AutoValue_LibraryVersion(str, str2);
            default:
                Component component = (Component) obj;
                try {
                    Trace.beginSection(str);
                    return component.factory.create(zzljVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // com.squareup.preferences.SharedPreferencesKeyValue.Writer
    public void write(SharedPreferences.Editor editor, Object obj) {
        String str = (String) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        obj.getClass();
        editor.putString(str, (String) function1.invoke(obj));
    }

    public Object create(KeysetHandle.Entry entry) {
        return ((PrimitiveRegistry) this.f$0).getPrimitiveWithoutReparsing(entry.getKey(), ((PrimitiveWrapper) this.f$1).getInputPrimitiveClass());
    }
}
