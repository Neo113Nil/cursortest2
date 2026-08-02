package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.activity.ComponentActivity;
import androidx.emoji2.emojipicker.EmojiPickerPopupView;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.go.navigator.domain.UserSpeedCollector$attach$$inlined$safeCollectIn$1;
import com.yandex.go.navigator.domain.a;
import com.yandex.go.navigator.domain.a0;
import com.yandex.go.navigator.domain.d0;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.t;
import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.runtime.recording.EventLoggingFactory;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechFullscreenSkipReason;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechFullscreenSkipScreen;
import flex.core.model.Document$TransitionSettings$Option$Interpolator;
import flex.engine.document.DocumentExtKt$createAnimatorListener$1;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public final class zrm implements vwo, ay01, bou, jg5 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public zrm(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 28;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j4n a() {
        Guidance guidance;
        j4n j4nVar = (j4n) this.c;
        if (j4nVar == null) {
            s14 s14Var = (s14) this.b;
            if (j4nVar == null) {
                j4nVar = new j4n();
                b2g b2gVar = new b2g(s14Var, 8);
                j4nVar.a = b2gVar;
                int i = 9;
                b2g b2gVar2 = new b2g(s14Var, i);
                int i2 = 10;
                b2g b2gVar3 = new b2g(s14Var, i2);
                b2g b2gVar4 = new b2g(s14Var, 11);
                ig7 ig7Var = new ig7(new b2g(s14Var, 6), i2);
                b2g b2gVar5 = new b2g(s14Var, 12);
                int i3 = 3;
                j4nVar.b = i5m.b(new ht0((Object) b2gVar, (xvf0) b2gVar2, (xvf0) b2gVar3, (xvf0) b2gVar4, (xvf0) new dx7(ig7Var, new p350(b2gVar5, i), 17), (xvf0) new b2g(s14Var, i3), (xvf0) b2gVar5, 5));
                b2g b2gVar6 = new b2g(s14Var, 4);
                int i4 = 1;
                b2g b2gVar7 = new b2g(s14Var, i4);
                j4nVar.c = b2gVar7;
                j4nVar.x = i5m.b(new sk21((b2g) j4nVar.a, b2gVar6, b2gVar7, i3));
                j4nVar.y = i5m.b(new q720(i5m.b(new di20(i5m.b(new h1t(new b2g(s14Var, 0), i3)), new b2g(s14Var, 5), (b2g) j4nVar.c, i4)), 21));
                j4nVar.z = i5m.b(uus.a);
                j4nVar.w = i5m.b(new z6x0(new b2g(s14Var, 7), (b2g) j4nVar.c, new b2g(s14Var, 2), new b2g(s14Var, 13), 22));
                this.c = j4nVar;
                o oVar = (o) s14Var.e;
                Navigation b = oVar.a.b();
                if (b != null && (guidance = b.getGuidance()) != null) {
                    oVar.c(guidance);
                }
                ((a) ((xvf0) j4nVar.b).get()).b();
                et21 et21Var = (et21) ((xvf0) j4nVar.x).get();
                hbp0 hbp0Var = et21Var.d;
                hbp0Var.a();
                tje.N(hbp0Var.c(), null, null, new UserSpeedCollector$attach$$inlined$safeCollectIn$1(e.t(new d0(et21Var.a.f)), null, et21Var.b), 3);
                com.yandex.go.navigator.safe.a aVar = (com.yandex.go.navigator.safe.a) ((xvf0) j4nVar.y).get();
                aVar.getClass();
                EventLoggingFactory.getEventLogging().subscribe(aVar);
                ((a0) ((xvf0) j4nVar.w).get()).b();
            }
        }
        return j4nVar;
    }

    public void b() {
        String str = (String) this.b;
        if (((FileChannel) this.c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.c = null;
            ny61.h(oyr.p("Unable to lock file: '", str, "'."), th);
        }
    }

    public void c(ye0 ye0Var, TechEvents$TechFullscreenSkipReason techEvents$TechFullscreenSkipReason, String str) {
        TechEvents$TechFullscreenSkipScreen techEvents$TechFullscreenSkipScreen;
        fcy0 fcy0Var = ((AppAnalyticsReporter) this.b).m0;
        if (ye0Var.equals(nfp0.b)) {
            techEvents$TechFullscreenSkipScreen = TechEvents$TechFullscreenSkipScreen.PRODUCTS;
        } else if (ye0Var.equals(lfp0.b)) {
            techEvents$TechFullscreenSkipScreen = TechEvents$TechFullscreenSkipScreen.DASHBOARD;
        } else if (ye0Var.equals(mfp0.b)) {
            techEvents$TechFullscreenSkipScreen = TechEvents$TechFullscreenSkipScreen.MERCHANT_OFFERS;
        } else if (ye0Var.equals(hfp0.b)) {
            techEvents$TechFullscreenSkipScreen = TechEvents$TechFullscreenSkipScreen.AUTOTOPUP;
        } else if (ye0Var.equals(ifp0.b)) {
            techEvents$TechFullscreenSkipScreen = TechEvents$TechFullscreenSkipScreen.AUTOTOPUP_V2;
        } else {
            if (!(ye0Var instanceof jfp0)) {
                w511.b();
                return;
            }
            techEvents$TechFullscreenSkipScreen = TechEvents$TechFullscreenSkipScreen.COMMON_DIVKIT;
        }
        jfp0 jfp0Var = ye0Var instanceof jfp0 ? (jfp0) ye0Var : null;
        String str2 = jfp0Var != null ? jfp0Var.b : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        linkedHashMap.put(MetaDataField.SCREEN_FIELD, techEvents$TechFullscreenSkipScreen.getOriginalValue());
        linkedHashMap.put(CRLReasonCodeExtension.REASON, techEvents$TechFullscreenSkipReason.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("payload", str);
        }
        if (str2 != null) {
            linkedHashMap.put("screen_path", str2);
        }
        fcy0Var.a.a("tech.fullscreen.skip", linkedHashMap);
    }

    @Override // defpackage.bou
    public gg90 createPlaylistParser() {
        return new u1n(20, ((bou) this.b).createPlaylistParser(), (List) this.c);
    }

    public m5s d(l5s l5sVar, LinkedHashMap linkedHashMap) {
        List list = l5sVar.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((m6s) this.b).a(linkedHashMap, ((n5s) obj).a, true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ycc.r(((n5s) it.next()).b, arrayList2);
        }
        return new m5s(l5sVar, arrayList2);
    }

    @Override // defpackage.vwo
    public ViewGroup.LayoutParams g() {
        int i;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.c;
        i = extendedFloatingActionButton.originalHeight;
        return new ViewGroup.LayoutParams(-1, i == 0 ? -2 : extendedFloatingActionButton.originalHeight);
    }

    @Override // defpackage.vwo
    public int getHeight() {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((mum) this.b).a;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.c;
        i = extendedFloatingActionButton2.originalHeight;
        if (i != -1) {
            i2 = extendedFloatingActionButton2.originalHeight;
            if (i2 != 0) {
                i3 = extendedFloatingActionButton2.originalHeight;
                if (i3 != -2) {
                    i4 = extendedFloatingActionButton2.originalHeight;
                    return i4;
                }
            }
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // defpackage.vwo
    public int getPaddingEnd() {
        int i;
        i = ((ExtendedFloatingActionButton) this.c).extendedPaddingEnd;
        return i;
    }

    @Override // defpackage.vwo
    public int getPaddingStart() {
        int i;
        i = ((ExtendedFloatingActionButton) this.c).extendedPaddingStart;
        return i;
    }

    @Override // defpackage.vwo
    public int getWidth() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        mum mumVar = (mum) this.b;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.c;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return mumVar.getWidth();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return mumVar.getWidth();
    }

    @Override // defpackage.ay01
    public void h(View view, vwl vwlVar, DocumentExtKt$createAnimatorListener$1 documentExtKt$createAnimatorListener$1) {
        ObjectAnimator objectAnimator = (ObjectAnimator) this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration((long) vwlVar.a);
        Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator = vwlVar.b;
        if (document$TransitionSettings$Option$Interpolator != null) {
            ((iuw) this.b).getClass();
            ofFloat.setInterpolator(iuw.b(document$TransitionSettings$Option$Interpolator));
        }
        ofFloat.addListener(documentExtKt$createAnimatorListener$1);
        this.c = ofFloat;
        ofFloat.start();
    }

    @Override // defpackage.ay01
    public void j(View view, vwl vwlVar, DocumentExtKt$createAnimatorListener$1 documentExtKt$createAnimatorListener$1) {
        ObjectAnimator objectAnimator = (ObjectAnimator) this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration((long) vwlVar.a);
        Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator = vwlVar.b;
        if (document$TransitionSettings$Option$Interpolator != null) {
            ((iuw) this.b).getClass();
            ofFloat.setInterpolator(iuw.b(document$TransitionSettings$Option$Interpolator));
        }
        ofFloat.addListener(documentExtKt$createAnimatorListener$1);
        this.c = ofFloat;
        ofFloat.start();
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        FlexAdapter flexAdapter;
        switch (this.a) {
            case 21:
                if (ig5Var instanceof aar) {
                    aar aarVar = (aar) ig5Var;
                    List<o2o> list = aarVar.b;
                    List list2 = list;
                    Map map = null;
                    if (list2 != null && !list2.isEmpty() && (flexAdapter = (FlexAdapter) this.c) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (o2o o2oVar : list) {
                            String variable = flexAdapter.getVariable(o2oVar.b);
                            Pair pair = variable != null ? new Pair(o2oVar.a, variable) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        Map s = b.s(arrayList);
                        if (!s.isEmpty()) {
                            map = s;
                        }
                    }
                    ((lg5) this.b).a(aarVar.c, aarVar.a, map);
                    break;
                }
                break;
            default:
                bvt bvtVar = (bvt) this.c;
                if (ig5Var instanceof qut) {
                    avt a = bvtVar.a();
                    mf1 c = bvtVar.c();
                    if (a != null && c != null) {
                        r1s r1sVar = new r1s(5, this, (qut) ig5Var, jh5Var);
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) a.a).a(new keo("google_pay_show_drawer", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Открытие шторки Google Pay")));
                        a.d = r1sVar;
                        ComponentActivity componentActivity = (ComponentActivity) a.c.get();
                        m50 m50Var = a.e;
                        if (componentActivity == null) {
                            a.a("Can't access activity");
                            break;
                        } else if (m50Var == null) {
                            a.a("Launcher is not registered");
                            break;
                        } else {
                            v741 v741Var = new v741();
                            v741Var.a(a.b == DefaultEnvironment.TESTING ? 3 : 1);
                            new rma0(componentActivity, componentActivity, x741.a, new w741(v741Var), sst.c).e(PaymentDataRequest.fromJson(c.b)).b(new xen(18, m50Var));
                            break;
                        }
                    } else {
                        vm50 vm50Var = ((qut) ig5Var).b;
                        if (vm50Var != null) {
                            jh5Var.a.dispatch(vm50Var);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.bou
    public gg90 createPlaylistParser(ynu ynuVar, unu unuVar) {
        return new u1n(20, ((bou) this.b).createPlaylistParser(ynuVar, unuVar), (List) this.c);
    }

    public /* synthetic */ zrm(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public zrm(v8w0 v8w0Var, nbj nbjVar) {
        this.a = 15;
        this.b = v8w0Var;
        this.c = kotlin.a.a(new c1o(this, nbjVar));
    }

    public zrm(vfx0 vfx0Var, com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.a0 a0Var) {
        this.a = 22;
        this.b = vfx0Var;
        this.c = e.t(new t(a0Var.c, this));
    }

    public zrm(zcx zcxVar, pgz pgzVar) {
        this.a = 18;
        this.b = zcxVar;
        this.c = kotlin.a.a(new c1o(13, pgzVar));
    }

    public zrm(String str) {
        this.a = 19;
        this.b = str.concat(".lck");
    }

    public zrm(Context context, EmojiPickerPopupView emojiPickerPopupView, View view) {
        this.a = 7;
        this.b = view;
        this.c = new PopupWindow((View) emojiPickerPopupView, -2, -2, false);
    }

    public /* synthetic */ zrm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public zrm(int i, int i2) {
        this.a = 28;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public zrm(int i, int i2, int i3) {
        this.a = 28;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public zrm(ExtendedFloatingActionButton extendedFloatingActionButton, mum mumVar) {
        this.a = 14;
        this.c = extendedFloatingActionButton;
        this.b = mumVar;
    }
}
