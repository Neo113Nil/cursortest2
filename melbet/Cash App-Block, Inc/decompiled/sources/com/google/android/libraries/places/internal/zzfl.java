package com.google.android.libraries.places.internal;

import android.content.SharedPreferences;
import com.google.common.base.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzfl implements Function {
    public static final /* synthetic */ zzfl zza = new zzfl(1);
    public static final /* synthetic */ zzfl zza$1 = new zzfl(2);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzfl(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                String string2 = sharedPreferences.getString("zb", "");
                if (string2 != null) {
                    break;
                }
                break;
        }
        return ((zzbnf) obj).zzc();
    }
}
