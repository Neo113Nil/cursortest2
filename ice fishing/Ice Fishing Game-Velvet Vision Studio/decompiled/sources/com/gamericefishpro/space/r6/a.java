package com.gamericefishpro.space.r6;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f5.y;
import com.gamericefishpro.space.l6.r;
import com.gamericefishpro.space.u6.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(y yVar, int i) {
        super(yVar);
        this.f = i;
    }

    @Override // com.gamericefishpro.space.r6.b
    public final boolean a(p workSpec) {
        switch (this.f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.b;
            case 1:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.d;
            case 2:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.a == r.e;
            case 3:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                r rVar = workSpec.j.a;
                return rVar == r.i || (Build.VERSION.SDK_INT >= 30 && rVar == r.y);
            default:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.e;
        }
    }

    @Override // com.gamericefishpro.space.r6.b
    public final boolean b(Object obj) {
        boolean zBooleanValue;
        switch (this.f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                com.gamericefishpro.space.q6.a value = (com.gamericefishpro.space.q6.a) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                return (value.a && value.b) ? false : true;
            case 3:
                com.gamericefishpro.space.q6.a value2 = (com.gamericefishpro.space.q6.a) obj;
                Intrinsics.checkNotNullParameter(value2, "value");
                return !value2.a || value2.c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
