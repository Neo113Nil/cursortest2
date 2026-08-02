package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class yi91 extends gp91 {
    public final /* synthetic */ e A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi91(e eVar, zzdf zzdfVar, String str, String str2) {
        super(eVar, true);
        this.x = 2;
        this.B = zzdfVar;
        this.y = str;
        this.z = str2;
        Objects.requireNonNull(eVar);
        this.A = eVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        switch (this.x) {
            case 0:
                zzcr zzcrVar = this.A.f;
                cvw.l(zzcrVar);
                zzcrVar.clearConditionalUserProperty(this.y, this.z, (Bundle) this.B);
                break;
            case 1:
                zzcr zzcrVar2 = this.A.f;
                cvw.l(zzcrVar2);
                zzcrVar2.getConditionalUserProperties(this.y, this.z, (zzco) this.B);
                break;
            default:
                zzcr zzcrVar3 = this.A.f;
                cvw.l(zzcrVar3);
                zzcrVar3.setCurrentScreenByScionActivityInfo((zzdf) this.B, this.y, this.z, this.a);
                break;
        }
    }

    @Override // defpackage.gp91
    public void b() {
        switch (this.x) {
            case 1:
                ((zzco) this.B).zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi91(e eVar, String str, String str2, Object obj, int i) {
        super(eVar, true);
        this.x = i;
        this.y = str;
        this.z = str2;
        this.B = obj;
        this.A = eVar;
    }
}
