package defpackage;

import android.content.Context;
import androidx.camera.camera2.internal.y;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.OptimizedSuperappSuggestMapItemView;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemView;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewProperties;
import com.yandex.go.top_modal.api.priority.PopupPriorityLauncher$PopupType;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuReporter$Item;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.delivery.ui.requirement.DeliverySelectRequirementDialog;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.intersection.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class zoi implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ zoi(sls slsVar, qez qezVar, dae0 dae0Var, PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType, aae0 aae0Var, String str) {
        this.a = 4;
        this.b = slsVar;
        this.c = qezVar;
        this.x = dae0Var;
        this.y = popupPriorityLauncher$PopupType;
        this.z = aae0Var;
        this.w = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Object obj;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                vu8 vu8Var = (vu8) obj6;
                g580 g580Var = (g580) vu8Var.H;
                String str = (String) obj5;
                String str2 = (String) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                DeliverySelectRequirementDialog deliverySelectRequirementDialog = (DeliverySelectRequirementDialog) obj2;
                Iterator it = ((api) obj7).d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (jl40.l(((b580) obj).a, str)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                b580 b580Var = (b580) obj;
                if (b580Var == null) {
                    ((x8) g580Var).d(str);
                } else {
                    ((x8) g580Var).c(b580Var, true);
                }
                yzh yzhVar = (yzh) vu8Var.J;
                rf70 b = b580Var != null ? b580Var.b() : null;
                pj pjVar = (pj) yzhVar.a;
                Map m = yzh.m(arrayList, b);
                pjVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
                hashMap.putAll(m);
                pjVar.a.a("DeliverySelectorDialog.NextButton.Tapped", hashMap, 1, new HashMap());
                ((x8) g580Var).a();
                deliverySelectRequirementDialog.dismiss();
                vu8Var.r(new qu(9));
                return zy11Var;
            case 1:
                ((a) obj7).c((np00) obj6, (Participant) obj5, (Participant) obj4, (List) obj3, (List) obj2);
                return zy11Var;
            case 2:
                ps10 ps10Var = (ps10) obj6;
                LocalMessageRef localMessageRef = (LocalMessageRef) obj5;
                j3b j3bVar = (j3b) obj4;
                y2r y2rVar = (y2r) obj3;
                nu10 nu10Var = (nu10) obj2;
                ((mu10) obj7).i.a(MessageMenuReporter$Item.OPEN_FILE);
                if (y2rVar != null) {
                    ps10Var.g(localMessageRef, j3bVar, y2rVar, nu10Var);
                }
                return zy11Var;
            case 3:
                OptimizedSuperappSuggestMapItemView.bindData$onImageLoaded((Ref$ObjectRef) obj7, (OptimizedSuperappSuggestMapItemView) obj6, (SuperappSuggestMapItemViewProperties) obj5, (zuj0) obj4, (Ref$ObjectRef) obj3, (List) obj2, false);
                return zy11Var;
            case 4:
                qez qezVar = (qez) obj6;
                dae0 dae0Var = (dae0) obj4;
                PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType = (PopupPriorityLauncher$PopupType) obj3;
                aae0 aae0Var = (aae0) obj2;
                String str3 = (String) obj5;
                ((sls) obj7).invoke();
                if (qezVar instanceof v9e0) {
                    Set set = dae0Var.e;
                    v9e0 v9e0Var = (v9e0) qezVar;
                    String str4 = v9e0Var.c;
                    if (kotlin.collections.a.G(set, str4) && str4 != null) {
                        dae0Var.f.put(str4, new q5r(v9e0Var.b, popupPriorityLauncher$PopupType, aae0Var != null ? aae0Var.a : null));
                        dae0Var.g(str4, str3, new q5r(str3, popupPriorityLauncher$PopupType, aae0Var != null ? aae0Var.a : null));
                    }
                }
                return zy11Var;
            case 5:
                w8v w8vVar = (w8v) obj7;
                ExecutorService executorService = (ExecutorService) obj6;
                iy40 iy40Var = (iy40) obj5;
                tls tlsVar = (tls) obj4;
                oz40 oz40Var = (oz40) obj3;
                oz40 oz40Var2 = (oz40) obj2;
                if (System.currentTimeMillis() - iy40Var.getLongValue() > 2000) {
                    iy40Var.setLongValue(System.currentTimeMillis());
                    me5 me5Var = new me5(tlsVar, oz40Var, oz40Var2, 4);
                    File createTempFile = File.createTempFile("IMG_", ".jpg");
                    w8vVar.O(new r1s(createTempFile, (OutputStream) null, (s8v) null), executorService, new zxs0(createTempFile, me5Var));
                }
                return zy11Var;
            case 6:
                SuperappSuggestMapItemView.bindData$onImageLoaded((Ref$ObjectRef) obj7, (SuperappSuggestMapItemView) obj6, (SuperappSuggestMapItemViewProperties) obj5, (zuj0) obj4, (Ref$ObjectRef) obj3, (List) obj2, false);
                return zy11Var;
            case 7:
                return Boolean.valueOf(((y) obj7).a((q84) obj6, (List) obj5, (HashMap) obj4, (ArrayList) obj3, (ArrayList) obj2));
            default:
                znx0 znx0Var = (znx0) obj7;
                return (jsx0) new tag().a((isx0) obj6, (Context) obj5, znx0Var.b, (ru.yandex.taxi.preorder.summary.selector.model.vertical.a) obj4, znx0Var.c, znx0Var.a, (qr31) obj3, (bmq0) obj2, new xnx0(), true).Q.get();
        }
    }

    public /* synthetic */ zoi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
    }
}
