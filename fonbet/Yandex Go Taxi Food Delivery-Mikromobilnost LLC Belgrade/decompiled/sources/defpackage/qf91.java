package defpackage;

import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;

/* loaded from: classes10.dex */
public final /* synthetic */ class qf91 implements u40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qf91(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ProxyBillingActivityV2) obj2).zza((ActivityResult) obj);
                break;
            case 1:
                ((ProxyBillingActivityV2) obj2).zzb((ActivityResult) obj);
                break;
            default:
                ((j18) obj2).resumeWith(obj);
                break;
        }
    }
}
