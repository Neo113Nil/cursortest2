package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.core.view.b;
import androidx.lifecycle.Lifecycle;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEvaluableType;
import com.yandex.go.tariffcard.experiment.EtaMulticlassHighlightingExperiment;
import com.yandex.go.tariffcard.ui.MultiTariffOption$LeadIconType;
import com.yandex.go.tariffcard.ui.view.TariffLeadView;
import com.yandex.go.tariffcard.ui.view.TariffTrailView;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.messaging.MessengerEnvironment;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.common.di.ICommonComponent;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent;
import ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController;
import ru.rt.ebs.cryptosdk.core.initialization.di.IInitializationComponent;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.verification.esia.di.IEsiaComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationFlowComponent;
import ru.rt.ebs.cryptosdk.entities.models.DefaultDesignOptions;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.cache.PinCacheMode;

/* loaded from: classes14.dex */
public final class wrr implements l40, IInitializationComponent, IComponent {
    public Object A;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object w;
    public final Object x;
    public Object y;
    public Object z;

    public wrr(knz knzVar, gpc gpcVar, hnz hnzVar, o2y0 o2y0Var) {
        this.a = 6;
        this.b = knzVar;
        this.c = gpcVar;
        this.w = new a3y0(TaxiOrderLogGroup.LONG_SEARCH_V2.getTag(), "LongSearchV2Facade");
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.x = ffx.b(0, 1, bufferOverflow);
        this.y = ffx.b(0, 1, bufferOverflow);
        this.z = ffx.b(0, 1, bufferOverflow);
        this.A = ffx.b(0, 1, bufferOverflow);
        knzVar.getClass();
        String str = o2y0Var.b().a;
        hnzVar.a();
        gnz gnzVar = gnz.e;
    }

    public void a(nzc0 nzc0Var) {
        ((HashSet) this.x).add(nzc0Var);
    }

    public void b(ozc0 ozc0Var) {
        ((HashSet) this.w).add(ozc0Var);
    }

    public List c() {
        return ((wub0) this.c).c();
    }

    public List d() {
        return ((wub0) this.b).c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    public void e(ikx0 ikx0Var) {
        String str;
        boolean z;
        boolean z2;
        ListItemComponent listItemComponent;
        wrr wrrVar = this;
        ikx0 ikx0Var2 = ikx0Var;
        ArrayList arrayList = ikx0Var2.j;
        Map map = ikx0Var2.r;
        Set a = ((g) ((h3y) wrrVar.c).get()).a(ikx0Var2.b.a);
        ViewGroup viewGroup = (ViewGroup) wrrVar.b;
        viewGroup.removeAllViews();
        boolean booleanValue = ((Boolean) ((qqo) wrrVar.y).b()).booleanValue();
        EtaMulticlassHighlightingExperiment etaMulticlassHighlightingExperiment = (EtaMulticlassHighlightingExperiment) ((ico) wrrVar.z).a.b();
        ?? r10 = 0;
        boolean z3 = etaMulticlassHighlightingExperiment.b && ikx0Var2.u;
        if (booleanValue && z3) {
            ArrayList<pex0> arrayList2 = ikx0Var2.j;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (pex0 pex0Var : arrayList2) {
                hq40 hq40Var = (hq40) map.get(pex0Var);
                String str2 = (hq40Var == null || !hq40Var.a) ? null : pex0Var.b;
                if (str2 != null) {
                    linkedHashSet.add(str2);
                }
            }
            str = m1b1.c(arrayList, linkedHashSet, a, etaMulticlassHighlightingExperiment.c);
        } else {
            str = null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pex0 pex0Var2 = (pex0) it.next();
            TariffLeadView tariffLeadView = new TariffLeadView(viewGroup.getContext());
            TariffTrailView tariffTrailView = new TariffTrailView(viewGroup.getContext());
            ListItemComponent listItemComponent2 = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
            listItemComponent2.setTitle(pex0Var2.l);
            hq40 hq40Var2 = (hq40) map.get(pex0Var2);
            fqb1.b(listItemComponent2, hq40Var2, (in40) ikx0Var2.s.get(pex0Var2));
            hn40 hn40Var = (hn40) ikx0Var2.t.get(pex0Var2);
            if (hn40Var != null) {
                tariffTrailView.setPriceInfo(hn40Var);
            }
            listItemComponent2.setLeadView(tariffLeadView);
            listItemComponent2.setTrailView(tariffTrailView);
            listItemComponent2.setUseAutoAccessibilityDelegate(r10);
            b.p(listItemComponent2, new cn40(tariffTrailView, r10));
            tariffLeadView.setup((pav) wrrVar.w, m1b1.b(pex0Var2, booleanValue, z3, str), pex0Var2.j, bn40.a[((mqv0) wrrVar.x).c().ordinal()] == 1 ? MultiTariffOption$LeadIconType.HIGH : MultiTariffOption$LeadIconType.USUAL);
            if (hq40Var2 != null) {
                z = true;
                z2 = false;
                if (hq40Var2.a) {
                    tariffTrailView.setCheckboxToggleOnClickEnabled(false);
                    listItemComponent2.setOnClickListener(null);
                    listItemComponent = listItemComponent2;
                    tariffTrailView.setChecked(a.contains(pex0Var2.b));
                    viewGroup.addView(listItemComponent);
                    wrrVar = this;
                    ikx0Var2 = ikx0Var;
                    r10 = z2;
                }
            } else {
                z = true;
                z2 = false;
            }
            tariffTrailView.setCheckboxToggleOnClickEnabled(z);
            listItemComponent = listItemComponent2;
            listItemComponent.setDebounceClickListener(new l9(this, ikx0Var, pex0Var2, tariffTrailView, 17));
            tariffTrailView.setChecked(a.contains(pex0Var2.b));
            viewGroup.addView(listItemComponent);
            wrrVar = this;
            ikx0Var2 = ikx0Var;
            r10 = z2;
        }
    }

    public wrr f(Expression expression, String str, List list) {
        return new wrr((String) this.b, (DivEvaluableType) this.c, expression, list, str, (rtf0) this.z);
    }

    public void g() {
        ((tj60) this.w).c("CashbackNotification");
        r0 r0Var = (r0) this.z;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // ru.rt.ebs.cryptosdk.core.initialization.di.IInitializationComponent
    public IInitializationController getInitializationController() {
        an8 an8Var = (an8) this.b;
        uwv uwvVar = (uwv) this.A;
        if (uwvVar != null) {
            return uwvVar;
        }
        IKeyStorage prefsKeyStorage = ((hwo0) this.c).prefsKeyStorage(((mpe) this.z).d);
        uwv uwvVar2 = new uwv(new reu(6, prefsKeyStorage), an8Var.getContext(), ((hwo0) this.w).getSecurityController(), ((xv10) this.x).getRegistrationController(), ((ht10) this.y).getMetadataController(), an8Var.getCommonController(), an8Var.getSdkDispatchers());
        this.A = uwvVar2;
        return uwvVar2;
    }

    public List h() {
        return ((wub0) this.A).a();
    }

    public ms31 i() {
        ms31 ms31Var;
        synchronized (this) {
            ms31Var = (ms31) this.y;
            if (ms31Var == null) {
                ms31Var = new ms31((IVerificationFlowComponent) this.b, (IEsiaComponent) this.c, (jnc) this.w, (ICommonComponent) this.x);
                this.y = ms31Var;
            }
        }
        return ms31Var;
    }

    public boolean j(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            mwb0 mwb0Var = (mwb0) it.next();
            if (((wub0) this.b).b.containsKey(mwb0Var)) {
                ((wub0) this.A).b(mwb0Var, mwb0Var);
                z = true;
            }
        }
        return z;
    }

    public void k(nzc0 nzc0Var) {
        ((HashSet) this.x).remove(nzc0Var);
    }

    public List l() {
        return ((wub0) this.z).a();
    }

    public List m() {
        return ((wub0) this.y).a();
    }

    public void n(Object obj) {
        String str = (String) this.b;
        List list = (List) this.x;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            w511.c(2, null, unr0.l('\'', "Cannot set property. No setters provided. Name: '", str));
            return;
        }
        try {
            switch (otf0.a[((DivEvaluableType) this.c).ordinal()]) {
                case 1:
                    break;
                case 2:
                    ((Number) obj).longValue();
                    break;
                case 3:
                    ((Number) obj).doubleValue();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
            ((rtf0) this.z).a(list, obj, str, (String) this.y);
        } catch (ClassCastException e) {
            throw new VariableMutationException("Unable to set value with type " + obj.getClass() + " to variable '" + str + '\'', e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void o(String str) {
        Object jSONObject;
        Object obj = str;
        switch (otf0.a[((DivEvaluableType) this.c).ordinal()]) {
            case 1:
                n(obj);
                return;
            case 2:
                try {
                    obj = Long.valueOf(Long.parseLong(str));
                    n(obj);
                    return;
                } catch (NumberFormatException e) {
                    throw new VariableMutationException(g8e.o("Failed to convert value to Long: ", str), e);
                }
            case 3:
                try {
                    obj = Double.valueOf(Double.parseDouble(str));
                    n(obj);
                    return;
                } catch (NumberFormatException e2) {
                    throw new VariableMutationException(g8e.o("Failed to convert value to Double: ", str), e2);
                }
            case 4:
                Boolean j0 = evu0.j0(str);
                if (j0 == null) {
                    try {
                        j0 = wwg.W(Integer.parseInt(str));
                        if (j0 == null) {
                            w511.c(2, null, "Failed to convert value to Boolean: ".concat(str));
                            return;
                        }
                    } catch (NumberFormatException e3) {
                        throw new VariableMutationException("Failed to convert value to Int: ".concat(str), e3);
                    }
                }
                obj = Boolean.valueOf(j0.booleanValue());
                n(obj);
                return;
            case 5:
                try {
                    try {
                        new URL(str);
                        jSONObject = new rg21(str);
                        obj = jSONObject;
                        n(obj);
                        return;
                    } catch (MalformedURLException unused) {
                        throw new IllegalArgumentException("Invalid url ".concat(str));
                    }
                } catch (IllegalArgumentException e4) {
                    w511.c(1, e4, null);
                    return;
                }
            case 6:
                try {
                    jSONObject = new jdc(((Number) com.yandex.div.internal.parser.b.b.invoke(str)).intValue());
                    obj = jSONObject;
                    n(obj);
                    return;
                } catch (ClassCastException e5) {
                    w511.c(1, e5, null);
                    return;
                }
            case 7:
                try {
                    jSONObject = new JSONObject(str);
                    obj = jSONObject;
                    n(obj);
                    return;
                } catch (JSONException e6) {
                    w511.c(1, e6, null);
                    return;
                }
            case 8:
                try {
                    jSONObject = new JSONArray(str);
                    obj = jSONObject;
                    n(obj);
                    return;
                } catch (JSONException e7) {
                    w511.c(1, e7, null);
                    return;
                }
            case 9:
                w511.c(2, null, "DateTime variables mutation from string is not supported.");
                return;
            default:
                w511.b();
                return;
        }
    }

    public List p() {
        return ((wub0) this.w).c();
    }

    public ptf0 q() {
        return new ptf0(new lvo(eg90.a, (String) ((Expression) this.w).b()), (String) this.b, (String) this.y, (List) this.x, (DivEvaluableType) this.c);
    }

    public List r() {
        return ((wub0) this.x).a();
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        switch (this.a) {
            case 2:
                uwv uwvVar = (uwv) this.A;
                if (uwvVar != null) {
                    uwvVar.release();
                }
                this.A = null;
                break;
            default:
                this.y = null;
                break;
        }
    }

    public wrr(wwv wwvVar, an8 an8Var, hwo0 hwo0Var, hwo0 hwo0Var2, xv10 xv10Var, ht10 ht10Var, mpe mpeVar) {
        this.a = 2;
        this.b = an8Var;
        this.c = hwo0Var;
        this.w = hwo0Var2;
        this.x = xv10Var;
        this.y = ht10Var;
        this.z = mpeVar;
    }

    public wrr(IVerificationFlowComponent iVerificationFlowComponent, IEsiaComponent iEsiaComponent, jnc jncVar, ICommonComponent iCommonComponent) {
        this.a = 23;
        this.b = iVerificationFlowComponent;
        this.c = iEsiaComponent;
        this.w = jncVar;
        this.x = iCommonComponent;
        this.z = DefaultDesignOptions.INSTANCE;
    }

    public wrr(exb0 exb0Var) {
        this.a = 20;
        PinCacheMode pinCacheMode = PinCacheMode.PERMANENT;
        this.b = exb0Var.a(pinCacheMode);
        PinCacheMode pinCacheMode2 = PinCacheMode.TRANSIENT;
        this.c = exb0Var.a(pinCacheMode2);
        this.w = exb0Var.a(pinCacheMode);
        this.x = exb0Var.a(pinCacheMode);
        this.y = exb0Var.a(pinCacheMode);
        this.z = exb0Var.a(pinCacheMode2);
        this.A = exb0Var.a(pinCacheMode2);
    }

    public wrr(Context context, d49 d49Var, tj60 tj60Var, c29 c29Var, a49 a49Var) {
        this.a = 15;
        this.b = context;
        this.c = d49Var;
        this.w = tj60Var;
        this.x = c29Var;
        this.y = a49Var;
        r0 c = bvf0.c(Boolean.FALSE);
        this.z = c;
        this.A = e.d(c);
    }

    public wrr(qcp0 qcp0Var, hwy0 hwy0Var, t0k0 t0k0Var, hjz hjzVar, dci dciVar, yuj0 yuj0Var, com.yandex.delivery.utils.dialogmanager.impl.b bVar, jwh jwhVar, qdc qdcVar) {
        this.a = 8;
        this.b = hwy0Var;
        this.c = t0k0Var;
        this.w = hjzVar;
        this.x = yuj0Var;
        this.y = bVar;
        this.z = jwhVar;
        this.A = qdcVar;
    }

    public wrr(Context context, bbj bbjVar, q6v q6vVar, k020 k020Var, MessengerEnvironment messengerEnvironment, rcy0 rcy0Var) {
        this.a = 16;
        this.b = context;
        this.c = bbjVar;
        this.w = q6vVar;
        this.x = k020Var;
        this.y = messengerEnvironment;
        this.z = rcy0Var;
        this.A = context.getResources().getString(nyh0.messenger_profile_team_feedback_form);
    }

    public /* synthetic */ wrr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
        this.A = obj7;
    }

    public wrr(String str, DivEvaluableType divEvaluableType, Expression expression, List list, String str2, rtf0 rtf0Var) {
        this.a = 24;
        this.b = str;
        this.c = divEvaluableType;
        this.w = expression;
        this.x = list;
        this.y = str2;
        this.z = rtf0Var;
    }

    public wrr(ViewGroup viewGroup, h3y h3yVar, pav pavVar, mqv0 mqv0Var, qqo qqoVar, ico icoVar) {
        this.a = 13;
        this.b = viewGroup;
        this.c = h3yVar;
        this.w = pavVar;
        this.x = mqv0Var;
        this.y = qqoVar;
        this.z = icoVar;
        this.A = new zm40();
    }

    public wrr(Activity activity, Lifecycle lifecycle) {
        this.a = 0;
        this.w = new HashSet();
        this.x = new HashSet();
        this.y = new HashSet();
        this.z = new HashSet();
        new HashSet();
        this.A = new HashSet();
        this.b = activity;
        this.c = new HiddenLifecycleReference(lifecycle);
    }
}
