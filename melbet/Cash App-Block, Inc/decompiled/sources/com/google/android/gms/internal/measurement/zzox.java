package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class zzox implements Function {
    public final /* synthetic */ int $r8$classId;
    public static final /* synthetic */ zzox zza$1 = new zzox(1);
    public static final /* synthetic */ zzox zza = new zzox(0);

    public /* synthetic */ zzox(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                zzxs zzxsVar = zzpg.zzc;
                return "";
            default:
                Context context = (Context) obj;
                String str = zzagr.zzc;
                if (str == null) {
                    synchronized (zzagr.class) {
                        try {
                            str = zzagr.zzc;
                            if (str == null) {
                                str = zzlg.zzb(context, "com.google.android.gms.measurement");
                                zzagr.zzc = str;
                            }
                        } finally {
                        }
                    }
                }
                return str;
        }
    }
}
