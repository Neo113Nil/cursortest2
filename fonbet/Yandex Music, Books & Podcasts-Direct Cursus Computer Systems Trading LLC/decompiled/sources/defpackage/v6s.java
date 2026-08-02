package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import androidx.fragment.app.t;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.chat.SupportChatActivity;
import ru.yandex.music.entry.EntryScreenActivity;
import ru.yandex.music.in_app_restore.RestorePurchasesActivity;
import ru.yandex.music.payment.pay.PromoCodeWebViewActivity;

/* loaded from: classes3.dex */
public final class v6s extends nq2 {
    public final p7s b;
    public final q7s c;
    public final t7s d;
    public final f7s e;
    public final z6s f;

    public v6s(p7s p7sVar, q7s q7sVar, t7s t7sVar, f7s f7sVar, z6s z6sVar) {
        super(new zs8(4, p7sVar));
        this.b = p7sVar;
        this.c = q7sVar;
        this.d = t7sVar;
        this.e = f7sVar;
        this.f = z6sVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.nq2
    public final boolean i(Uri uri, JSONObject jSONObject) {
        String C;
        if (!Intrinsics.d(uri != null ? uri.getScheme() : null, "tariff_paywall")) {
            return false;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            int hashCode = authority.hashCode();
            p7s p7sVar = this.b;
            switch (hashCode) {
                case -191501435:
                    if (authority.equals("feedback")) {
                        ((aik) this.e.b.getValue()).a();
                        t tVar = p7sVar.b.a;
                        int i = SupportChatActivity.w;
                        tVar.startActivity(qcm.d(tVar, esr.PAYWALL));
                        return true;
                    }
                    break;
                case 94756344:
                    if (authority.equals("close")) {
                        p7sVar.b();
                        return true;
                    }
                    break;
                case 830706846:
                    if (authority.equals("change_account")) {
                        ((aik) this.f.b.getValue()).a();
                        fy3 fy3Var = p7sVar.b;
                        int i2 = EntryScreenActivity.y;
                        t tVar2 = fy3Var.a;
                        tVar2.startActivity(yd5.y(tVar2, mdb.a));
                        return true;
                    }
                    break;
                case 974647069:
                    if (authority.equals("promo_code")) {
                        if (jSONObject == null || (C = wct.C("promo_code_url", jSONObject)) == null) {
                            return true;
                        }
                        ((aik) this.c.b.getValue()).a();
                        t tVar3 = p7sVar.b.a;
                        int i3 = PromoCodeWebViewActivity.w;
                        tVar3.startActivity(hdg.a0(tVar3, C, null));
                        return true;
                    }
                    break;
                case 1927286561:
                    if (authority.equals("restore_purchases")) {
                        ((aik) this.d.b.getValue()).a();
                        fy3 fy3Var2 = p7sVar.b;
                        int i4 = RestorePurchasesActivity.y;
                        t tVar4 = fy3Var2.a;
                        Parcelable.Creator<zee> creator = zee.CREATOR;
                        neg.C(tVar4);
                        return true;
                    }
                    break;
            }
        }
        su4.s(2, null, k5r.k(uri, "unknown div action "), null);
        return false;
    }
}
