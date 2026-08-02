package defpackage;

import android.os.Bundle;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class dda extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dda(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((hda) this.receiver).d.B();
                break;
            case 1:
                t tVar = ((hda) this.receiver).c.a;
                int i = SearchActivity.Z;
                tVar.startActivity(rvf.F(tVar, c0p.c, p0p.q));
                break;
            case 2:
                hda hdaVar = (hda) this.receiver;
                hdaVar.a.a(hdaVar.f, new o57(1, hdaVar.b, ida.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 4));
                break;
            case 3:
                ((yda) this.receiver).d.B();
                break;
            case 4:
                t tVar2 = ((yda) this.receiver).c.a;
                int i2 = SearchActivity.Z;
                tVar2.startActivity(rvf.F(tVar2, c0p.c, p0p.q));
                break;
            case 5:
                yda ydaVar = (yda) this.receiver;
                ydaVar.a.a(ydaVar.e, new o57(1, ydaVar.b, aea.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 5));
                break;
            case 6:
                ((tea) this.receiver).c.B();
                break;
            case 7:
                t tVar3 = ((tea) this.receiver).b.a;
                int i3 = SearchActivity.Z;
                tVar3.startActivity(rvf.F(tVar3, c0p.b, p0p.q));
                break;
            case 8:
                ((rfa) this.receiver).c.B();
                break;
            case 9:
                t tVar4 = ((rfa) this.receiver).b.a;
                int i4 = SearchActivity.Z;
                tVar4.startActivity(rvf.F(tVar4, c0p.a, p0p.q));
                break;
            case 10:
                eha ehaVar = (eha) this.receiver;
                xbc xbcVar = ehaVar.a;
                gha ghaVar = ehaVar.b;
                p0s p0sVar = (p0s) ehaVar.f.getValue();
                if (p0sVar != null) {
                    int ordinal = p0sVar.ordinal();
                    if (ordinal == 0) {
                        xbcVar.a(ehaVar.g, new o57(1, ghaVar, gha.class, "onOwnFilterItemClick", "onOwnFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 8));
                    } else if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else {
                        xbcVar.a(ehaVar.h, new o57(1, ghaVar, gha.class, "onLikedFilterItemClick", "onLikedFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 9));
                    }
                }
                break;
            case 11:
                t tVar5 = ((eha) this.receiver).c.a;
                int i5 = SearchActivity.Z;
                tVar5.startActivity(rvf.F(tVar5, c0p.c, p0p.q));
                break;
            case 12:
                ((eha) this.receiver).d.B();
                break;
            case 13:
                ((xha) this.receiver).c.B();
                break;
            case 14:
                t tVar6 = ((xha) this.receiver).b.a;
                int i6 = SearchActivity.Z;
                tVar6.startActivity(rvf.F(tVar6, c0p.b, p0p.q));
                break;
            case 15:
                break;
            case 16:
                ((nla) this.receiver).b.a.getOnBackPressedDispatcher().d();
                break;
            case 17:
                nla nlaVar = (nla) this.receiver;
                tnb.d((tnb) nlaVar.c.a.getValue(), wjb.SearchScreen);
                t tVar7 = nlaVar.b.a;
                int i7 = SearchActivity.Z;
                tVar7.startActivity(rvf.F(tVar7, c0p.c, p0p.q));
                break;
            case 18:
                qva qvaVar = (qva) this.receiver;
                pu0 H = qvaVar.y().H();
                if (H != null) {
                    Bundle arguments = qvaVar.getArguments();
                    fva fvaVar = arguments != null ? (fva) arguments.getParcelable("data") : null;
                    if (fvaVar == null) {
                        xq0.x("Required value was null.");
                        break;
                    } else {
                        String str = fvaVar.l;
                        if (str == null) {
                            ssg.a(7, "DynamicOverlayFragment", "advDisclaimer is null", null);
                        } else {
                            y supportFragmentManager = qvaVar.requireActivity().getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            x2i.a0(supportFragmentManager, jf0.C(H, ru0.DARK), new teb(str));
                        }
                    }
                } else {
                    ssg.a(7, "DynamicOverlayFragment", "appThemeConfig is null", null);
                }
                break;
            case 19:
                ((w0b) this.receiver).a();
                break;
            case 20:
                ((w0b) this.receiver).a();
                break;
            case 21:
                ((wya) this.receiver).b.e();
                break;
            case 22:
                ((wya) this.receiver).b.d();
                break;
            case 23:
                ((wya) this.receiver).b.c();
                break;
            case 24:
                ((wya) this.receiver).b.b();
                break;
            case 25:
                ((sai) this.receiver).a();
                break;
            case 26:
                ((sai) this.receiver).a();
                break;
            case 27:
                ((sai) this.receiver).a();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((heb) this.receiver).d.B();
                break;
            default:
                t tVar8 = ((heb) this.receiver).c.a;
                int i8 = SearchActivity.Z;
                tVar8.startActivity(rvf.F(tVar8, c0p.b, p0p.q));
                break;
        }
        return Unit.a;
    }
}
