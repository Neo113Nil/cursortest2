package ru.yandex.video.m3.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.ui.AspectRatioFrameLayout;
import defpackage.acg;
import defpackage.b6e;
import defpackage.btf;
import defpackage.dn9;
import defpackage.ecg;
import defpackage.fcg;
import defpackage.gcg;
import defpackage.hcg;
import defpackage.hrl;
import defpackage.icg;
import defpackage.irl;
import defpackage.jcg;
import defpackage.ji7;
import defpackage.jyr;
import defpackage.kcg;
import defpackage.l2j;
import defpackage.mbg;
import defpackage.ngl;
import defpackage.np7;
import defpackage.ogp;
import defpackage.omr;
import defpackage.p9g;
import defpackage.pve;
import defpackage.pwe;
import defpackage.q5b;
import defpackage.qdc;
import defpackage.r7o;
import defpackage.rag;
import defpackage.rre;
import defpackage.t7o;
import defpackage.ujl;
import defpackage.uop;
import defpackage.vdr;
import defpackage.vq1;
import defpackage.vx7;
import defpackage.wn5;
import defpackage.xz0;
import defpackage.y7g;
import defpackage.yjj;
import defpackage.z7o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$NotStartReason;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$TerminalReason;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.a;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ListYandexPlayerView extends FrameLayout {
    public final rre a;
    public final yjj b;
    public final yjj c;
    public final omr d;
    public final ImageView e;
    public final jyr f;
    public final hcg g;
    public final gcg h;
    public acg i;
    public boolean j;
    public final hrl k;
    public final hrl l;
    public boolean m;
    public pve n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListYandexPlayerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImageView.ScaleType scaleType;
        context.getClass();
        rre rreVar = new rre(27);
        this.a = rreVar;
        this.b = new yjj();
        this.c = new yjj();
        omr omrVar = new omr(context, attributeSet);
        this.d = omrVar;
        ImageView imageView = new ImageView(context, attributeSet);
        this.e = imageView;
        this.f = btf.b(new ji7(context, 6));
        this.g = new hcg(this);
        this.h = new gcg(this);
        this.j = true;
        hrl hrlVar = new hrl(0, new kcg(this, 0), false);
        this.k = hrlVar;
        hrl hrlVar2 = new hrl(1, new kcg(this, 1), this.j);
        this.l = hrlVar2;
        this.n = new np7(this.m);
        addView(omrVar, -1, -1);
        omrVar.setVisibility(0);
        addView(imageView, -1, -1);
        imageView.bringToFront();
        imageView.setVisibility(!this.j ? 0 : 8);
        ImageView.ScaleType scaleType2 = getScaleType();
        scaleType2.getClass();
        hrlVar.e = scaleType2;
        ImageView.ScaleType scaleType3 = getScaleType();
        scaleType3.getClass();
        hrlVar2.e = scaleType3;
        this.n.a(xz0.Y(new hrl[]{hrlVar, hrlVar2}));
        d();
        if (attributeSet != null && (scaleType = (ImageView.ScaleType) xz0.E(attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "scaleType", -1), ImageView.ScaleType.values())) != null) {
            setScaleType(scaleType);
        }
        Drawable background = getBackground();
        Unit unit = null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            setShutterColor(colorDrawable.getColor());
        }
        ecg ecgVar = fcg.a;
        dn9 dn9Var = fcg.b;
        dn9Var = dn9Var == null ? null : dn9Var;
        if (dn9Var != null) {
            WeakHashMap weakHashMap = (WeakHashMap) dn9Var.d;
            ujl ujlVar = new ujl();
            a aVar = (a) dn9Var.b;
            qdc qdcVar = (qdc) dn9Var.c;
            AtomicReference atomicReference = (AtomicReference) dn9Var.e;
            AtomicInteger atomicInteger = (AtomicInteger) dn9Var.f;
            ogp ogpVar = l2j.d;
            Context context2 = getContext();
            context2.getClass();
            weakHashMap.put(this, new WeakReference(new mbg(this, ujlVar, aVar, qdcVar, atomicReference, atomicInteger, ogpVar.s(context2))));
            unit = Unit.a;
        }
        if (unit == null) {
            ngl.r(rreVar, "LPView", "View created before ListYandexPlayerManager is initialized! Telemetry will not work.", null, null, new Object[0], 12);
        }
    }

    private final ComposeView getDebugView() {
        return (ComposeView) this.f.getValue();
    }

    @vx7
    public static /* synthetic */ void getFirstFrameUntilPlay$annotations() {
    }

    private final void setShutterColor(int i) {
        View view = this.d.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
        this.e.setBackgroundColor(i);
    }

    private final void setVideoScaleType(ImageView.ScaleType scaleType) {
        int i = 0;
        switch (icg.a[scaleType.ordinal()]) {
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                ngl.r(this.a, "LPView", "Unsupported scale type: " + scaleType + ". Use FIT_XY, FIT_CENTER, CENTER_CROP.", null, null, new Object[0], 12);
                break;
            default:
                b6e.s();
                return;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.d.b;
        vq1.B(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public final void a(vdr vdrVar, vdr vdrVar2) {
        vdrVar.getClass();
        vdrVar2.getClass();
        if (getDebugView().getParent() != null) {
            return;
        }
        ComposeView debugView = getDebugView();
        debugView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        debugView.setContent(new wn5(new jcg(vdrVar, vdrVar2, 1), 945099184, true));
        debugView.bringToFront();
        addView(getDebugView());
    }

    public final void b() {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        rre rreVar = this.a;
        rreVar.getClass();
        rreVar.H(e(), "detach", null, new Object[0]);
        g(uop.b(this.l));
        acg acgVar = this.i;
        if (acgVar != null) {
            acgVar.g();
        }
        acg acgVar2 = this.i;
        if (acgVar2 != null) {
            acgVar2.h(this.g);
        }
        acg acgVar3 = this.i;
        if (acgVar3 != null) {
            gcg gcgVar = this.h;
            gcgVar.getClass();
            acgVar3.u.e(gcgVar);
        }
        acg acgVar4 = this.i;
        if (acgVar4 != null) {
            acgVar4.a.H(acgVar4.h, "onDetachFromView", "detach view isWithEngine = " + acgVar4.f(), new Object[0]);
            ListYandexPlayerView listYandexPlayerView = acgVar4.n;
            omr omrVar = acgVar4.m;
            if (omrVar != null) {
                omrVar.d(null);
            }
            acgVar4.m = null;
            acgVar4.n = null;
            acgVar4.A = null;
            if (listYandexPlayerView != null) {
                yjj yjjVar = acgVar4.u;
                synchronized (yjjVar.a) {
                    u02 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u02.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((p9g) next).i(acgVar4, listYandexPlayerView);
                        t7oVar2 = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar2 = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar2);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
            }
        }
        this.d.d(null);
        acg acgVar5 = this.i;
        if (acgVar5 != null) {
            yjj yjjVar2 = this.b;
            synchronized (yjjVar2.a) {
                u0 = CollectionsKt.u0(yjjVar2.a);
            }
            Iterator it2 = u0.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                try {
                    r7o r7oVar3 = z7o.b;
                    rag ragVar = (rag) next2;
                    ragVar.getClass();
                    mbg mbgVar = ragVar.a;
                    acgVar5.u.e(mbgVar.g);
                    acgVar5.h(mbgVar.h);
                    mbgVar.b(ListViewTelemetryLogger$TerminalReason.NOT_START_PLAYBACK, ListViewTelemetryLogger$NotStartReason.DROP_SOURCE);
                    mbgVar.i.g0(1);
                    mbgVar.k = null;
                    mbgVar.l = null;
                    mbgVar.i.g0(4);
                    t7oVar = Unit.a;
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(th2);
                }
                Throwable a2 = z7o.a(t7oVar);
                if (a2 != null) {
                    Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                }
            }
        }
        this.i = null;
        f(uop.b(this.l));
    }

    public final void c() {
        if (getDebugView().getParent() == null) {
            return;
        }
        removeView(getDebugView());
    }

    public final void d() {
        this.e.setScaleType(this.k.e);
        setVideoScaleType(this.l.e);
    }

    public final String e() {
        return "LPView-" + String.format(Locale.US, "%04d", Arrays.copyOf(new Object[]{Integer.valueOf(hashCode() % 10000)}, 1)) + '-' + y7g.v(this.i) + '}';
    }

    public final void f(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((hrl) obj).d) {
                arrayList.add(obj);
            }
        }
        Set A0 = CollectionsKt.A0(arrayList);
        Iterator it = A0.iterator();
        while (it.hasNext()) {
            ((hrl) it.next()).d = false;
        }
        this.n.e(A0);
    }

    public final void g(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((hrl) obj).d) {
                arrayList.add(obj);
            }
        }
        this.n.f(CollectionsKt.A0(arrayList));
    }

    @NotNull
    public final ImageView getFirstFrameImageView$video_player_internalRelease() {
        return this.e;
    }

    public final boolean getFirstFrameUntilPlay() {
        return this.m;
    }

    @NotNull
    public final ImageView.ScaleType getScaleType() {
        ImageView.ScaleType scaleType = this.e.getScaleType();
        scaleType.getClass();
        return scaleType;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        HashSet u0;
        Object t7oVar;
        super.onSizeChanged(i, i2, i3, i4);
        acg acgVar = this.i;
        if (acgVar != null) {
            yjj yjjVar = acgVar.u;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((p9g) next).h(acgVar, i, i2);
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        setShutterColor(i);
    }

    public final void setController(@NotNull irl irlVar) {
        irlVar.getClass();
        this.n.a(q5b.a);
        pwe pweVar = new pwe(irlVar);
        this.n = pweVar;
        pweVar.a(xz0.Y(new hrl[]{this.l, this.k}));
        d();
    }

    public final void setFirstFrameUntilPlay(boolean z) {
        this.n.d(z);
        this.m = z;
    }

    public final void setScaleType(@NotNull ImageView.ScaleType scaleType) {
        scaleType.getClass();
        hrl hrlVar = this.k;
        hrlVar.getClass();
        hrlVar.e = scaleType;
        hrl hrlVar2 = this.l;
        hrlVar2.getClass();
        hrlVar2.e = scaleType;
        d();
    }

    public /* synthetic */ ListYandexPlayerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListYandexPlayerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }
}
