package com.google.android.datatransport.runtime.dagger.internal;

import android.content.Context;
import com.caverock.androidsvg.SVG;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;

/* loaded from: classes4.dex */
public final class InstanceFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Object instance;

    public /* synthetic */ InstanceFactory(Object obj, int i) {
        this.$r8$classId = i;
        this.instance = obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Object obj = this.instance;
        switch (i) {
            case 0:
                return obj;
            default:
                Context context = (Context) ((InstanceFactory) obj).instance;
                int i2 = 5;
                return new SVG(context, new zzc(i2), new zzb(i2), false, 26);
        }
    }
}
