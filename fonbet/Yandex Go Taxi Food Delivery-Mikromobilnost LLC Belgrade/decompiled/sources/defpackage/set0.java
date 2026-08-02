package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.pickuppoints.api.AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;
import com.yandex.go.pickuppoints.impl.l;
import com.yandex.go.search.model.DecideLaterConfig;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.q;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class set0 {
    public final ah00 a;
    public final dqe0 b;
    public final rft0 c;
    public final lxg d;
    public final net0 e;
    public final c8r f;
    public final q g;
    public final h3y h;
    public final h3y i;

    public set0(ah00 ah00Var, dqe0 dqe0Var, rft0 rft0Var, lxg lxgVar, net0 net0Var, c8r c8rVar, q qVar, h3y h3yVar, h3y h3yVar2) {
        this.a = ah00Var;
        this.b = dqe0Var;
        this.c = rft0Var;
        this.d = lxgVar;
        this.e = net0Var;
        this.f = c8rVar;
        this.g = qVar;
        this.h = h3yVar;
        this.i = h3yVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0117, code lost:
    
        if (r14 == com.yandex.go.pickuppoints.api.AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType.COPTER_CITY_TOUR_SELECTOR) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0128, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
    
        r7 = r7[r30.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012f, code lost:
    
        if (r7 == 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0131, code lost:
    
        if (r7 != 2) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0135, code lost:
    
        if (r14 != com.yandex.go.pickuppoints.api.AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType.SELECT_ON_MAP) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0145, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0146, code lost:
    
        r7 = r9.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0148, code lost:
    
        if (r15 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014a, code lost:
    
        r7.z((defpackage.m950) r7.j0.get(), new defpackage.yio0(7, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0162, code lost:
    
        if (r7.i0.f(r13) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0166, code lost:
    
        if (r33 != ru.yandex.taxi.preorder.source.ModalViewOrigin.SUMMARY) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0168, code lost:
    
        r0 = r9.b.h0;
        ((defpackage.pep0) r0.b).f((defpackage.m950) r0.a.get(), new defpackage.xh50(r30.a(), new defpackage.ii50(r13), (defpackage.bhh) null, (defpackage.rx3) null, 28), defpackage.hxx.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019a, code lost:
    
        if (r10 == 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a0, code lost:
    
        if (r30.a() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a6, code lost:
    
        if (r31.X1() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a8, code lost:
    
        r1 = r5.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01af, code lost:
    
        r0.invoke(r33, r1, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ad, code lost:
    
        r1 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b7, code lost:
    
        if (r10 == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b9, code lost:
    
        if (r6 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bb, code lost:
    
        r7 = r9.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bf, code lost:
    
        if (r33 != ru.yandex.taxi.preorder.source.ModalViewOrigin.SUMMARY) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c1, code lost:
    
        r0 = "summary";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c6, code lost:
    
        r4 = new defpackage.arb(r0, com.yandex.go.destination_picker.ChooseAddressMode.DESTINATION, r33);
        r19 = new defpackage.pv0(r6, null, null, null, null, null, null, null, 1022);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e4, code lost:
    
        if (r12 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e6, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e9, code lost:
    
        r7.A((defpackage.m950) r7.V.get(), new defpackage.rzi(r31, r2, r19, r4, ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason.SUMMARY), new defpackage.j83(4, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0205, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e8, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c4, code lost:
    
        r0 = "pickup_location";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0206, code lost:
    
        r5 = new defpackage.w7o0(20, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0211, code lost:
    
        if (r6 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0213, code lost:
    
        if (r12 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0216, code lost:
    
        r16 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0226, code lost:
    
        r14 = new defpackage.ojd(r31, r16, r30, r18, r5, r2, r4);
        r6 = r9.b;
        r6.B((defpackage.m950) r6.a0.get(), new defpackage.c83(r14, r32, r33, false, new defpackage.jht0(r6, 0)), defpackage.sy60.Q2, defpackage.m1j0.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0249, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0223, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0142, code lost:
    
        if (r33 != ru.yandex.taxi.preorder.source.ModalViewOrigin.SUMMARY) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0138, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013e, code lost:
    
        if (r8 != com.yandex.go.pickuppoints.api.AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType.SELECT_ON_MAP) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0124, code lost:
    
        if (r33 != ru.yandex.taxi.preorder.source.ModalViewOrigin.SUMMARY) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0126, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0120, code lost:
    
        if (r8 == com.yandex.go.pickuppoints.api.AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType.COPTER_CITY_TOUR_SELECTOR) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(PointType pointType, Address address, SourcePicker sourcePicker, ModalViewOrigin modalViewOrigin, boolean z, boolean z2, boolean z3) {
        DecideLaterConfig decideLaterConfig;
        ClarifyPointsScreenStrategyConfigurationExperiment.SummaryInnerConfigurationDto summaryInnerConfigurationDto;
        ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType primarySuggestType;
        ClarifyPointsScreenStrategyConfigurationExperiment.SummaryInnerConfigurationDto summaryInnerConfigurationDto2;
        ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType primarySuggestType2;
        ClarifyPointsScreenStrategyConfigurationExperiment.SummaryInnerConfigurationDto summaryInnerConfigurationDto3;
        ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType primarySuggestType3;
        ClarifyPointsScreenStrategyConfigurationExperiment.SummaryInnerConfigurationDto summaryInnerConfigurationDto4;
        ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType primarySuggestType4;
        String str;
        rft0 rft0Var = this.c;
        int i = 1;
        u0j u0jVar = null;
        String str2 = "";
        if (z3) {
            decideLaterConfig = DecideLaterConfig.a;
        } else {
            mi31 a = this.f.a(this.b.a.O.a, "", null);
            pex0 pex0Var = a != null ? a.a : null;
            lxg lxgVar = this.d;
            b0j b0jVar = lxgVar.b;
            decideLaterConfig = new DecideLaterConfig(!b0jVar.b(pex0Var) && "zero_suggest_top".equalsIgnoreCase(lxgVar.a().b), !b0jVar.b(pex0Var) && "search_results_bottom".equalsIgnoreCase(lxgVar.a().b));
        }
        qet0 qet0Var = new qet0(this, pointType, address, sourcePicker, modalViewOrigin, z, z2, z3);
        pet0 pet0Var = new pet0(this, i);
        w7o0 w7o0Var = new w7o0(19, this);
        qht0 qht0Var = (qht0) rft0Var;
        u0j u0jVar2 = kzi.a;
        d0l0 c = qht0Var.b.T.c();
        Address b = c.b();
        if (z) {
            u0jVar = new dzi(qht0Var.b.T.c().b.indexOf(b));
        } else if (z2) {
            u0jVar = tyi.a;
        }
        pex0 m = ((k) qht0Var.b.U).m();
        if (m != null && (str = m.b) != null) {
            str2 = str;
        }
        l lVar = (l) qht0Var.b.g0;
        ClarifyPointsScreenStrategyConfigurationExperiment.SummaryConfigurationDto summaryConfigurationDto = lVar.c;
        if (summaryConfigurationDto == null || (summaryInnerConfigurationDto4 = summaryConfigurationDto.a) == null || (primarySuggestType4 = summaryInnerConfigurationDto4.b) == null || (r8 = l.a(primarySuggestType4)) == null) {
            ClarifyPointsScreenStrategyConfigurationExperiment.SummaryConfigurationDto summaryConfigurationDto2 = lVar.c;
            AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType a2 = (summaryConfigurationDto2 == null || (summaryInnerConfigurationDto = summaryConfigurationDto2.a) == null || (primarySuggestType = summaryInnerConfigurationDto.a) == null) ? AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType.TEXT_SUGGEST : l.a(primarySuggestType);
        }
        ClarifyPointsScreenStrategyConfigurationExperiment.SummaryConfigurationDto summaryConfigurationDto3 = lVar.c;
        if (summaryConfigurationDto3 == null || (summaryInnerConfigurationDto3 = summaryConfigurationDto3.a) == null || (primarySuggestType3 = summaryInnerConfigurationDto3.c) == null || (r14 = l.a(primarySuggestType3)) == null) {
            ClarifyPointsScreenStrategyConfigurationExperiment.SummaryConfigurationDto summaryConfigurationDto4 = lVar.c;
            AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType a3 = (summaryConfigurationDto4 == null || (summaryInnerConfigurationDto2 = summaryConfigurationDto4.a) == null || (primarySuggestType2 = summaryInnerConfigurationDto2.a) == null) ? AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType.TEXT_SUGGEST : l.a(primarySuggestType2);
        }
        int[] iArr = kht0.a;
        int i2 = iArr[pointType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                w511.b();
            }
        }
    }

    public final void b(SourcePicker sourcePicker, ModalViewOrigin modalViewOrigin, boolean z) {
        this.g.a(new cc2(this, sourcePicker, modalViewOrigin, z, 8));
    }

    public final void c(SourcePicker sourcePicker, ModalViewOrigin modalViewOrigin) {
        PointType pointType = PointType.SOURCE;
        zgc0 zgc0Var = PlainAddress.Companion;
        zzs b = ((gh00) this.a).e.b();
        zgc0Var.getClass();
        a(pointType, zgc0.a(b), sourcePicker, modalViewOrigin, true, false, false);
    }
}
