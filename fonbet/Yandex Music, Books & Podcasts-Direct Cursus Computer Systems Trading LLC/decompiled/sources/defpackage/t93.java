package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import ru.yandex.music.entry.EntryScreenActivity;
import ru.yandex.music.support.AppFeedbackActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class t93 extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t93(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        oq oqVar;
        v54 v54Var;
        v54 v54Var2;
        switch (this.a) {
            case 0:
                ((y93) this.receiver).b.a.finish();
                break;
            case 1:
                y93 y93Var = (y93) this.receiver;
                cb3 cb3Var = (cb3) y93Var.a.C.getValue();
                oqVar = cb3Var instanceof ab3 ? ((ab3) cb3Var).a.a : null;
                if (oqVar != null) {
                    qbj qbjVar = y93Var.b;
                    LinkedList linkedList = oqVar.F;
                    qbjVar.getClass();
                    linkedList.getClass();
                    qbjVar.d.I(oqVar, linkedList);
                }
                break;
            case 2:
                y93 y93Var2 = (y93) this.receiver;
                cb3 cb3Var2 = (cb3) y93Var2.a.C.getValue();
                oqVar = cb3Var2 instanceof ab3 ? ((ab3) cb3Var2).a.a : null;
                if (oqVar != null) {
                    y93Var2.b.b(oqVar);
                }
                break;
            case 3:
                ((y93) this.receiver).a.N();
                break;
            case 4:
                ((y93) this.receiver).b.a.finish();
                break;
            case 5:
                y93 y93Var3 = (y93) this.receiver;
                cb3 cb3Var3 = (cb3) y93Var3.a.C.getValue();
                oqVar = cb3Var3 instanceof ab3 ? ((ab3) cb3Var3).a.a : null;
                if (oqVar != null) {
                    qbj qbjVar2 = y93Var3.b;
                    LinkedList linkedList2 = oqVar.F;
                    qbjVar2.getClass();
                    linkedList2.getClass();
                    qbjVar2.d.I(oqVar, linkedList2);
                }
                break;
            case 6:
                y93 y93Var4 = (y93) this.receiver;
                cb3 cb3Var4 = (cb3) y93Var4.a.C.getValue();
                oqVar = cb3Var4 instanceof ab3 ? ((ab3) cb3Var4).a.a : null;
                if (oqVar != null) {
                    y93Var4.b.b(oqVar);
                }
                break;
            case 7:
                ((y93) this.receiver).b.a.finish();
                break;
            case 8:
                y93 y93Var5 = (y93) this.receiver;
                cb3 cb3Var5 = (cb3) y93Var5.a.C.getValue();
                oqVar = cb3Var5 instanceof ab3 ? ((ab3) cb3Var5).a.a : null;
                if (oqVar != null) {
                    qbj qbjVar3 = y93Var5.b;
                    LinkedList linkedList3 = oqVar.F;
                    qbjVar3.getClass();
                    linkedList3.getClass();
                    qbjVar3.d.I(oqVar, linkedList3);
                }
                break;
            case 9:
                y93 y93Var6 = (y93) this.receiver;
                cb3 cb3Var6 = (cb3) y93Var6.a.C.getValue();
                oqVar = cb3Var6 instanceof ab3 ? ((ab3) cb3Var6).a.a : null;
                if (oqVar != null) {
                    y93Var6.b.b(oqVar);
                }
                break;
            case 10:
                ce5 ce5Var = ((va3) this.receiver).a;
                rmb.a((rmb) ce5Var.h, sjb.Ok, null, null, 14);
                ((icj) ce5Var.b).F();
                break;
            case 11:
                ((qbj) ((va3) this.receiver).a.c).a.finish();
                break;
            case 12:
                ce5 ce5Var2 = ((va3) this.receiver).a;
                rmb.j((rmb) ce5Var2.h, wjb.SearchScreen, (thj) ce5Var2.p, null, 12);
                qbj qbjVar4 = (qbj) ce5Var2.c;
                oq oqVar2 = (oq) ce5Var2.e;
                LinkedList linkedList4 = oqVar2.F;
                qbjVar4.getClass();
                linkedList4.getClass();
                qbjVar4.d.I(oqVar2, linkedList4);
                break;
            case 13:
                ce5 ce5Var3 = ((va3) this.receiver).a;
                rmb.j((rmb) ce5Var3.h, wjb.BottomsheetScreen, null, null, 14);
                ((qbj) ce5Var3.c).b((oq) ce5Var3.e);
                break;
            case 14:
                dk3 dk3Var = (dk3) this.receiver;
                bk3 bk3Var = dk3Var.a.a;
                Map b = tah.b(new Pair("LogIn_clicked", Boolean.TRUE));
                bk3Var.getClass();
                b.getClass();
                ot0.A(bk3Var.e(), "Foreign_Alert", b);
                ix6 ix6Var = dk3Var.b;
                int i = EntryScreenActivity.y;
                t tVar = (t) ix6Var.b;
                tVar.startActivity(yd5.y(tVar, mdb.a));
                break;
            case 15:
                ((ny3) this.receiver).e();
                break;
            case 16:
                ((ny3) this.receiver).a();
                break;
            case 17:
                ((ny3) this.receiver).a();
                break;
            case 18:
                ((ny3) this.receiver).f();
                break;
            case 19:
                ((ny3) this.receiver).g();
                break;
            case 20:
                ((ny3) this.receiver).a();
                break;
            case 21:
                ((ny3) this.receiver).f();
                break;
            case 22:
                ((ny3) this.receiver).g();
                break;
            case 23:
                z74 z74Var = (z74) this.receiver;
                l74 l74Var = z74Var.b;
                b84 b84Var = z74Var.a;
                z64 z64Var = (z64) b84Var.e.getValue(b84Var, b84.h[2]);
                z64Var.getClass();
                sml smlVar = l74Var.a;
                if (smlVar != null) {
                    j2n j2nVar = (j2n) smlVar.a;
                    if (!(z64Var instanceof y64)) {
                        if (!(z64Var instanceof x64)) {
                            b6e.s();
                            break;
                        } else {
                            l1n l1nVar = j2nVar.q;
                            if (l1nVar != null) {
                                if (!(z64Var instanceof y64)) {
                                    if (!(z64Var instanceof x64)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        v54Var = v54.PULT_WITH_STATIONS;
                                    }
                                } else {
                                    v54Var = v54.PULT;
                                }
                                j2n.a(j2nVar, l1nVar, v54Var);
                                j2nVar.f(true);
                            }
                        }
                    } else {
                        l1n l1nVar2 = j2nVar.p;
                        if (l1nVar2 != null) {
                            if (!(z64Var instanceof y64)) {
                                if (!(z64Var instanceof x64)) {
                                    b6e.s();
                                    break;
                                } else {
                                    v54Var2 = v54.PULT_WITH_STATIONS;
                                }
                            } else {
                                v54Var2 = v54.PULT;
                            }
                            j2n.a(j2nVar, l1nVar2, v54Var2);
                            j2nVar.f(true);
                        }
                    }
                }
                break;
            case 24:
                l74 l74Var2 = ((z74) this.receiver).b;
                sml smlVar2 = l74Var2.a;
                if (smlVar2 != null) {
                    t tVar2 = l74Var2.b.a;
                    j2n j2nVar2 = (j2n) smlVar2.a;
                    y74 y74Var = (y74) j2nVar2.t.getValue();
                    y74Var.a.a(new qya(hlb.Bottomsheet, 0), wjb.PultPickerScreen, y74Var.b.G());
                    ((zza) j2nVar2.r.getValue()).a(tVar2).U(new i0b());
                }
                break;
            case 25:
                sml smlVar3 = ((z74) this.receiver).b.a;
                if (smlVar3 != null) {
                    j2n j2nVar3 = (j2n) smlVar3.a;
                    Context context = j2nVar3.a;
                    int i2 = AppFeedbackActivity.c;
                    mrr mrrVar = mrr.PULT_PICKER;
                    x7c x7cVar = x7c.PULT_STATION_FEEDBACK;
                    String str = ((c74) j2nVar3.m.getValue()).c;
                    context.getClass();
                    Intent putExtra = new Intent(context, (Class<?>) AppFeedbackActivity.class).putExtra("extra_message", (String) null);
                    if (str == null || StringsKt.U(str)) {
                        str = null;
                    }
                    Intent putExtra2 = putExtra.putExtra("extra_payload", str).putExtra("extra_hint_text", (String) null).putExtra("extra_topic", x7cVar).putExtra("extra_source", mrrVar);
                    putExtra2.getClass();
                    y7g.O(context, putExtra2);
                }
                break;
            case 26:
                l74 l74Var3 = (l74) this.receiver;
                l74Var3.b.a();
                sml smlVar4 = l74Var3.a;
                if (smlVar4 != null) {
                    j2n j2nVar4 = (j2n) smlVar4.a;
                    s9f[] s9fVarArr = j2n.D;
                    j2nVar4.f(false);
                }
                break;
            case 27:
                l74 l74Var4 = (l74) this.receiver;
                l74Var4.b.a();
                sml smlVar5 = l74Var4.a;
                if (smlVar5 != null) {
                    j2n j2nVar5 = (j2n) smlVar5.a;
                    s9f[] s9fVarArr2 = j2n.D;
                    j2nVar5.f(false);
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                xiu xiuVar = ((vb4) this.receiver).a;
                ef3.g(ef3.b, muo.MY_PLAYLISTS, df3.PLAYLIST_BOTTOMSHEET, pe3.TAKE_PHOTO);
                ((ub4) xiuVar.b).invoke();
                ((iz7) ((xzi) xiuVar.c).a).o();
                break;
            default:
                xiu xiuVar2 = ((vb4) this.receiver).a;
                ef3.g(ef3.b, muo.MY_PLAYLISTS, df3.PLAYLIST_BOTTOMSHEET, pe3.CHOOSE_PHOTO);
                ((ub4) xiuVar2.b).invoke();
                ((iz7) ((xzi) xiuVar2.c).a).f();
                break;
        }
        return Unit.a;
    }
}
