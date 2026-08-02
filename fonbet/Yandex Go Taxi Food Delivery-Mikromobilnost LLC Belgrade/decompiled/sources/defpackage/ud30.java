package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.AttachedSurfaceControl;
import android.view.Display;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.SurfaceSyncGroup;
import androidx.camera.core.g;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.flex.main_screen.data.widgets.plaque.PlaqueWidgetItemView;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import com.yandex.go.requirements.comment.summary.ui.v1.RequirementsCommentView;
import com.yandex.go.scooters.passes.v2.ScootersPackagesModalView;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.cost_center.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.objects.PaymentChange;
import com.yandex.go.taxi.order.models.api.objects.ReorderInfo;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.PaidOptions;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.paging.PagedLoader$LoadState;
import com.yandex.messaging.paging.PagedLoader$LoadType;
import com.yandex.payment.sdk.ui.CardInputView;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.PlusPayConfettiView;
import com.ybsdk.navigation.NavigationFragment;
import defpackage.unr0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.random.Random;
import ru.rt.ebs.cryptosdk.common.liveness.CameraType;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording.PhotoRecordingFragment;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.surge.dialog.PaidOptionDialog;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.preload_manager.PreloadRequest;
import ru.yandex.video.m3.preload_manager.PreloadTrackInfoRepository;
import ru.yandex.video.m3.previews.PreviewsManagerImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class ud30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ ud30(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v73, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, sge0] */
    @Override // java.lang.Runnable
    public final void run() {
        String name;
        z790 z790Var;
        int i;
        AttachedSurfaceControl rootSurfaceControl;
        boolean add;
        List list;
        List list2;
        List list3;
        List list4;
        vqw vqwVar;
        i7o0 binding;
        int i2;
        int i3 = 3;
        String str = null;
        str = null;
        int i4 = 2;
        r7 = 0;
        int i5 = 0;
        int i6 = 1;
        switch (this.a) {
            case 0:
                MtCheckoutModalView.renderSuccessCheckoutPaymentState$lambda$3$2((CheckoutUIState$PaymentCheckoutUIState) this.b, (MtCheckoutModalView) this.c, (ld30) this.w);
                return;
            case 1:
                FragmentActivity fragmentActivity = (FragmentActivity) this.b;
                NavigationFragment navigationFragment = (NavigationFragment) this.c;
                Runnable runnable = (Runnable) this.w;
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar = new a(supportFragmentManager);
                aVar.p(navigationFragment);
                aVar.n();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ((CardInputView) this.b).setNfcCardAndDate((String) this.c, (String) this.w);
                return;
            case 3:
                ((i00) ((lg60) this.b).b.get()).a(new wz60((ChatRequest) this.c, (Bundle) this.w));
                return;
            case 4:
                rp70 rp70Var = (rp70) this.b;
                o2y0 o2y0Var = (o2y0) this.c;
                Dialog.Action action = (Dialog.Action) this.w;
                ci70 ci70Var = rp70Var.d;
                String str2 = o2y0Var.b().a;
                qov qovVar = ci70Var.q;
                String b = ci70Var.b(str2);
                if (action != null && (name = action.name()) != null) {
                    str = name.toLowerCase(Locale.US);
                }
                qovVar.b(str2, b, "close", str);
                return;
            case 5:
                OrderFragment.openModalView$lambda$0((OrderFragment) this.b, (ModalView) this.c, (s45) this.w);
                return;
            case 6:
                OrderStackView.openOrderViewDetails$lambda$2((OrderStackView) this.b, (TaxiCardNavigationAction) this.c, (o2y0) this.w);
                return;
            case 7:
                ap80 ap80Var = (ap80) this.b;
                com.yandex.go.places.impl.ui.organizations.recycler.viewholders.images.a aVar2 = (com.yandex.go.places.impl.ui.organizations.recycler.viewholders.images.a) this.c;
                f65 f65Var = (f65) this.w;
                ap80Var.f.setVisibility(8);
                ap80Var.e.setVisibility(0);
                GoFrameLayout goFrameLayout = ap80Var.a;
                goFrameLayout.setClipToOutline(true);
                c.z(new yi80(11), goFrameLayout);
                pav pavVar = aVar2.S;
                GoImageView goImageView = ap80Var.d;
                nac nacVar = (nac) pavVar.a(goImageView);
                nacVar.i = new wj80(aVar2, f65Var, i4);
                nacVar.h = new zl50(22, aVar2, f65Var);
                nacVar.f(goImageView.getMeasuredWidth(), goImageView.getMeasuredHeight());
                nacVar.c(f65Var.c.a);
                return;
            case 8:
                b890 b890Var = (b890) this.b;
                PagedLoader$LoadType pagedLoader$LoadType = (PagedLoader$LoadType) this.c;
                PagedLoader$LoadState pagedLoader$LoadState = (PagedLoader$LoadState) this.w;
                WeakReference weakReference = b890Var.k;
                if (weakReference == null || (z790Var = (z790) weakReference.get()) == null) {
                    return;
                }
                z790Var.b(pagedLoader$LoadType, pagedLoader$LoadState);
                return;
            case 9:
                b890 b890Var2 = (b890) this.b;
                PagedLoader$LoadType pagedLoader$LoadType2 = (PagedLoader$LoadType) this.c;
                w790 w790Var = (w790) this.w;
                boolean z = w790Var.c;
                boolean z2 = w790Var.b;
                List list5 = w790Var.a;
                ArrayList arrayList = b890Var2.e;
                int i7 = a890.a[pagedLoader$LoadType2.ordinal()];
                if (i7 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list5);
                    PagedLoader$LoadType pagedLoader$LoadType3 = PagedLoader$LoadType.INIT;
                    PagedLoader$LoadState pagedLoader$LoadState2 = PagedLoader$LoadState.COMPLETE;
                    b890Var2.f(pagedLoader$LoadType3, pagedLoader$LoadState2);
                    if (!z2) {
                        b890Var2.f(PagedLoader$LoadType.PREPEND, pagedLoader$LoadState2);
                    }
                    if (!z) {
                        b890Var2.f(PagedLoader$LoadType.APPEND, pagedLoader$LoadState2);
                    }
                } else if (i7 != 2) {
                    if (i7 != 3) {
                        w511.b();
                        return;
                    }
                    if (list5.isEmpty()) {
                        b890Var2.f(PagedLoader$LoadType.PREPEND, PagedLoader$LoadState.COMPLETE);
                        return;
                    }
                    arrayList.addAll(0, list5);
                    b890Var2.f(PagedLoader$LoadType.PREPEND, z2 ? PagedLoader$LoadState.IDLE : PagedLoader$LoadState.COMPLETE);
                    int size = b890Var2.i - list5.size();
                    b890Var2.i = size;
                    if (size > 0) {
                        b890Var2.e();
                    }
                } else {
                    if (list5.isEmpty()) {
                        b890Var2.f(PagedLoader$LoadType.APPEND, PagedLoader$LoadState.COMPLETE);
                        return;
                    }
                    arrayList.addAll(list5);
                    b890Var2.f(PagedLoader$LoadType.APPEND, z ? PagedLoader$LoadState.IDLE : PagedLoader$LoadState.COMPLETE);
                    int size2 = b890Var2.j - list5.size();
                    b890Var2.j = size2;
                    if (size2 > 0) {
                        b890Var2.d();
                    }
                }
                b890Var2.b.post(new sd30(b890Var2, new ArrayList(arrayList), pagedLoader$LoadType2, list5));
                return;
            case 10:
                y990 y990Var = (y990) this.b;
                PaidOptions.Alert alert = (PaidOptions.Alert) this.c;
                String str3 = (String) this.w;
                aa90 aa90Var = (aa90) y990Var.b.get();
                op70 op70Var = new op70(15, y990Var);
                ba90 ba90Var = (ba90) aa90Var;
                MainActivity mainActivity = ba90Var.a;
                if (alert.c.length() != 0) {
                    String str4 = alert.d;
                    if (str4 == null || evu0.J(str4)) {
                        str4 = mainActivity.getString(kyh0.dialog_common_ok);
                    }
                    new PaidOptionDialog(mainActivity, ba90Var.c.b(((k) ba90Var.b).m())).setTitle((CharSequence) alert.b).setMessage((CharSequence) alert.c).addButton(str4).setDismissListener(op70Var).show();
                }
                mx70.b(y990Var.d.b, null, "summary_screen", str3, 1);
                return;
            case 11:
                PaymentChange.Reason reason = (PaymentChange.Reason) this.b;
                o2y0 o2y0Var2 = (o2y0) this.c;
                xx90 xx90Var = (xx90) this.w;
                String str5 = reason.a;
                if ("DEBT_ALLOWED".equals(str5) || "DEBT_USER".equals(str5)) {
                    TaxiOrder b2 = o2y0Var2.b();
                    b2.getClass();
                    synchronized (b2) {
                        TaxiOrderLocalData taxiOrderLocalData = b2.l;
                        taxiOrderLocalData.getClass();
                        b2.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1048577, 16777215);
                    }
                    xx90Var.a.f();
                    return;
                }
                return;
            case 12:
                s3v s3vVar = (s3v) this.b;
                CameraType cameraType = (CameraType) this.c;
                bhb0 bhb0Var = (bhb0) this.w;
                PreviewView previewView = PhotoRecordingFragment.access$getViewBinding(((kib0) s3vVar).a).f;
                Display display = previewView.getDisplay();
                int rotation = display != null ? display.getRotation() : 0;
                int i8 = ahb0.a[cameraType.ordinal()];
                if (i8 == 1) {
                    i = 0;
                } else {
                    if (i8 != 2) {
                        w511.b();
                        return;
                    }
                    i = 1;
                }
                ws7 ws7Var = new ws7();
                ws7Var.b(i);
                xs7 a = ws7Var.a();
                o89 o89Var = bhb0Var.f;
                bhb0Var.c = o89Var != null ? (i5f0) o89Var.get() : null;
                asj0 asj0Var = new asj0();
                asj0Var.a = new s83(0, 1);
                bsj0 a2 = asj0Var.a();
                pxe0 pxe0Var = new pxe0();
                pxe0Var.a.w(icv.w2, a2);
                pxe0Var.h(rotation);
                g f = pxe0Var.f();
                f.J(previewView.getSurfaceProvider());
                q8v q8vVar = new q8v();
                q8vVar.a.w(x8v.b, 1);
                q8vVar.h(a2);
                q8vVar.i(rotation);
                bhb0Var.b = q8vVar.f();
                i5f0 i5f0Var = bhb0Var.c;
                if (i5f0Var != null) {
                    i5f0Var.g();
                }
                i5f0 i5f0Var2 = bhb0Var.c;
                if (i5f0Var2 != null) {
                    i5f0Var2.d(((kib0) s3vVar).a, a, f, bhb0Var.b);
                    return;
                }
                return;
            case 13:
                PlaqueWidgetItemView.initButton$lambda$0((PlaqueWidgetItemView) this.b, (x27) this.c, (pwz0) this.w);
                return;
            case 14:
                PlaqueWidgetItemView.initHint$lambda$0((PlaqueWidgetItemView) this.b, (wju) this.c, (pwz0) this.w);
                return;
            case 15:
                hzc0 hzc0Var = (hzc0) this.b;
                SurfaceView surfaceView = (SurfaceView) this.c;
                wnb0 wnb0Var = (wnb0) this.w;
                rootSurfaceControl = surfaceView.getRootSurfaceControl();
                if (rootSurfaceControl == null) {
                    return;
                }
                SurfaceSyncGroup f2 = fzc0.f();
                hzc0Var.a = f2;
                add = f2.add(rootSurfaceControl, new d82(1));
                d6z.x(add);
                wnb0Var.run();
                rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
                return;
            case 16:
                final PlusPayConfettiView.a aVar3 = (PlusPayConfettiView.a) this.b;
                PlusPayConfettiView plusPayConfettiView = (PlusPayConfettiView) this.c;
                zad0 zad0Var = (zad0) this.w;
                int i9 = zad0Var.d;
                aVar3.getClass();
                ArrayList arrayList2 = new ArrayList(80);
                for (int i10 = 0; i10 < 80; i10++) {
                    arrayList2.add(new PointF(0.0f, 0.0f));
                }
                plusPayConfettiView.confettiPoints = arrayList2;
                ArrayList arrayList3 = new ArrayList(80);
                for (int i11 = 0; i11 < 80; i11++) {
                    arrayList3.add(new Point(0, 0));
                }
                aVar3.d = arrayList3;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Random.Default r12 = Random.a;
                    int i13 = gga1.i(zad0Var.b, r12);
                    int i14 = gga1.i(zad0Var.c, r12);
                    list = plusPayConfettiView.confettiPoints;
                    ((PointF) list.get(i12)).y = -i9;
                    ((Point) aVar3.d.get(i12)).y = i14;
                    int i15 = i12 % 3;
                    if (i15 == 0) {
                        list2 = plusPayConfettiView.confettiPoints;
                        ((PointF) list2.get(i12)).x = 0.0f;
                        ((Point) aVar3.d.get(i12)).x = i13;
                    } else if (i15 != 1) {
                        list4 = plusPayConfettiView.confettiPoints;
                        PointF pointF = (PointF) list4.get(i12);
                        c9 c9Var = Random.b;
                        pointF.x = c9Var.k() * plusPayConfettiView.getWidth();
                        ((Point) aVar3.d.get(i12)).x = (c9Var.j().nextBoolean() ? 1 : -1) * i13;
                    } else {
                        list3 = plusPayConfettiView.confettiPoints;
                        ((PointF) list3.get(i12)).x = plusPayConfettiView.getWidth();
                        ((Point) aVar3.d.get(i12)).x = -i13;
                    }
                }
                int[] iArr = new int[80];
                for (int i16 = 0; i16 < 80; i16++) {
                    iArr[i16] = ((Number) kotlin.collections.a.p0(zad0Var.a, Random.a)).intValue();
                }
                plusPayConfettiView.confettiColors = iArr;
                ArrayList arrayList4 = new ArrayList(80);
                for (int i17 = 0; i17 < 80; i17++) {
                    aVar3.b.getClass();
                    float f3 = i9;
                    Random.a.getClass();
                    float k = Random.b.k() * 0.8f * f3;
                    Path path = new Path();
                    path.moveTo(k, 0.0f);
                    path.lineTo(0.0f, 0.0f);
                    path.cubicTo(0.0f, 0.0f, 0.0f, f3, f3, f3);
                    path.cubicTo(f3, f3, k, f3 * 0.5f, k, 0.0f);
                    arrayList4.add(path);
                }
                plusPayConfettiView.confettiShapes = arrayList4;
                int[] iArr2 = new int[80];
                for (int i18 = 0; i18 < 80; i18++) {
                    Random.a.getClass();
                    iArr2[i18] = Random.b.f(0, 361);
                }
                plusPayConfettiView.confettiRotation = iArr2;
                plusPayConfettiView.confettiGlobalAlpha = 255;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(8000L);
                aVar3.e = duration;
                duration.addUpdateListener(new vf2(aVar3, plusPayConfettiView, zad0Var));
                duration.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.pay.ui.core.mobile.view.confetti.PlusPayConfettiView$Controller$startConfettiAnimation$lambda$10$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        Iterator it = PlusPayConfettiView.a.this.c.iterator();
                        if (it.hasNext()) {
                            throw unr0.i(it);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                duration.start();
                return;
            case 17:
                final RobotoTextView robotoTextView = (RobotoTextView) this.b;
                final yo90 yo90Var = (yo90) this.c;
                final tge0 tge0Var = (tge0) this.w;
                if (robotoTextView.getHeight() > 0) {
                    yo90Var.run();
                    return;
                }
                tge0Var.d();
                ?? r3 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sge0
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        if (RobotoTextView.this.getHeight() <= 0) {
                            return;
                        }
                        tge0Var.d();
                        yo90Var.run();
                    }
                };
                tge0Var.d = r3;
                robotoTextView.getViewTreeObserver().addOnGlobalLayoutListener(r3);
                return;
            case 18:
                PreloadTrackInfoRepository.cancel$lambda$2((String) this.b, (wls) this.c, (PreloadTrackInfoRepository) this.w);
                return;
            case 19:
                PreloadTrackInfoRepository.fetchTracksAsync$lambda$1((PreloadRequest) this.b, (PreloadTrackInfoRepository) this.c, (wls) this.w);
                return;
            case 20:
                PreviewsManagerImpl.PlayerObserverImpl.startFetchRawThumbnailsInfoIfNeededOnPlayerThread$lambda$1((PreviewsManagerImpl.PlayerObserverImpl) this.b, (kwu) this.c, (Ref$LongRef) this.w);
                return;
            case 21:
                hsf0 hsf0Var = (hsf0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Runnable runnable3 = (Runnable) this.w;
                hsf0Var.d();
                hsf0Var.g(hsf0Var.b(0.0f, 1.0f, 200L, new fsf0(hsf0Var, i6)), false, runnable2, runnable3);
                return;
            case 22:
                FragmentActivity fragmentActivity2 = (FragmentActivity) this.b;
                ig5 ig5Var = (ig5) this.c;
                q6c0 q6c0Var = (q6c0) this.w;
                Window window = fragmentActivity2.getWindow();
                if (window == null) {
                    return;
                }
                if (!((ztf0) ig5Var).a) {
                    window.clearFlags(8192);
                    vqw vqwVar2 = (vqw) q6c0Var.w;
                    if (vqwVar2 != null) {
                        fragmentActivity2.getLifecycle().d(vqwVar2);
                    }
                    WeakReference weakReference2 = (WeakReference) q6c0Var.c;
                    if ((weakReference2 != null ? (FragmentActivity) weakReference2.get() : null) == fragmentActivity2) {
                        q6c0Var.c = null;
                        q6c0Var.w = null;
                        return;
                    }
                    return;
                }
                WeakReference weakReference3 = (WeakReference) q6c0Var.c;
                FragmentActivity fragmentActivity3 = weakReference3 != null ? (FragmentActivity) weakReference3.get() : null;
                if (fragmentActivity3 != fragmentActivity2 || ((vqw) q6c0Var.w) == null) {
                    if (fragmentActivity3 != null && fragmentActivity3 != fragmentActivity2) {
                        vqw vqwVar3 = (vqw) q6c0Var.w;
                        if (vqwVar3 != null) {
                            fragmentActivity3.getLifecycle().d(vqwVar3);
                        }
                    } else if (fragmentActivity3 == fragmentActivity2 && (vqwVar = (vqw) q6c0Var.w) != null) {
                        fragmentActivity2.getLifecycle().d(vqwVar);
                    }
                    window.addFlags(8192);
                    q6c0Var.c = new WeakReference(fragmentActivity2);
                    vqw vqwVar4 = new vqw(i4, new odf0(i3, q6c0Var));
                    q6c0Var.w = vqwVar4;
                    fragmentActivity2.getLifecycle().a(vqwVar4);
                    return;
                }
                return;
            case 23:
                ((h5g0) this.b).a((String) this.c, (String) this.w);
                return;
            case 24:
                MtQRCameraPreview mtQRCameraPreview = (MtQRCameraPreview) this.b;
                ggg0 ggg0Var = (ggg0) this.c;
                tls tlsVar = (tls) this.w;
                float width = mtQRCameraPreview.getWidth() / ggg0Var.c;
                float height = mtQRCameraPreview.getHeight() / ggg0Var.d;
                Rect rect = ggg0Var.b;
                Rect rect2 = new Rect((int) (rect.left * width), (int) (rect.top * height), (int) (rect.right * width), (int) (rect.bottom * height));
                if (mtQRCameraPreview.getDefaultQrTargetRect().contains(rect2) || mtQRCameraPreview.isQrRectGrabbed()) {
                    Uri uri = ggg0Var.a;
                    rect2.set(rect2.left - 8, rect2.top - 8, rect2.right + 8, rect2.bottom + 8);
                    tlsVar.invoke(new zdg0(uri, rect2));
                    return;
                }
                return;
            case 25:
                e0j0 e0j0Var = (e0j0) this.b;
                final o2y0 o2y0Var3 = (o2y0) this.c;
                pzi0 pzi0Var = (pzi0) this.w;
                pit pitVar = e0j0Var.a;
                xdf xdfVar = pitVar.e;
                apf apfVar = pitVar.h;
                if (pzi0Var == null) {
                    sdc sdcVar = new sdc(6, o2y0Var3);
                    Iterator it = ((ArrayDeque) apfVar.c).iterator();
                    while (it.hasNext()) {
                        if (apf.r((tdj) it.next(), mit.class, sdcVar)) {
                            it.remove();
                        }
                    }
                    tdj tdjVar = (tdj) apfVar.w;
                    if (tdjVar != null ? apf.r(tdjVar, mit.class, sdcVar) : false) {
                        apfVar.k();
                        return;
                    }
                    return;
                }
                ief iefVar = pzi0Var.b;
                ReorderInfo reorderInfo = pzi0Var.a;
                tdj tdjVar2 = new tdj(o2y0Var3);
                tdjVar2.b = kub1.d(xdfVar, iefVar, reorderInfo.d);
                tdjVar2.c = kub1.d(xdfVar, iefVar, reorderInfo.b);
                tdjVar2.f = new t26(10, pitVar, pzi0Var, o2y0Var3);
                final mit mitVar = new mit(o2y0Var3, pzi0Var);
                if (apfVar.n(tdjVar2, mitVar)) {
                    Predicate predicate = new Predicate() { // from class: kit
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            mit mitVar2 = (mit) obj;
                            return mitVar2 != mit.this && mitVar2.a == o2y0Var3;
                        }
                    };
                    Iterator it2 = ((ArrayDeque) apfVar.c).iterator();
                    while (it2.hasNext()) {
                        if (apf.r((tdj) it2.next(), mit.class, predicate)) {
                            it2.remove();
                        }
                    }
                    tdj tdjVar3 = (tdj) apfVar.w;
                    if (tdjVar3 != null ? apf.r(tdjVar3, mit.class, predicate) : false) {
                        apfVar.k();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                RequirementsCommentView.initInputView$lambda$0$0((RequirementsCommentView) this.b, (ListItemInputComponent) this.c, (iqj0) this.w);
                return;
            case 27:
                b bVar = (b) this.b;
                com.yandex.go.taxi.order.cost_center.a aVar4 = (com.yandex.go.taxi.order.cost_center.a) this.c;
                String str6 = (String) this.w;
                e2y0 e2y0Var = bVar.g;
                o2y0 o2y0Var4 = aVar4.c;
                rp70 rp70Var2 = ((f) e2y0Var.a).C1;
                rp70Var2.getClass();
                tdj tdjVar4 = new tdj(o2y0Var4);
                tdjVar4.b = rp70Var2.b(kyh0.summary_cost_center_item_title);
                tdjVar4.c = str6;
                tdjVar4.g = rp70Var2.b(kyh0.common_ok);
                rp70Var2.c.n(tdjVar4, new pp70(o2y0Var4, "CostCenterChangeErrorDialog"));
                return;
            case 28:
                kil0 kil0Var = (kil0) this.b;
                String str7 = (String) this.c;
                jil0 jil0Var = (jil0) this.w;
                fjl0 fjl0Var = (fjl0) kil0Var.c.b;
                hjl0 hjl0Var = fjl0Var.d;
                fjl0Var.c = str7;
                ws01 M = jil0Var.M();
                if (M != null) {
                    hjl0Var.w.B.c.put(Integer.valueOf(jil0Var.getLocalPort()), M);
                    hjl0Var.O = true;
                }
                hjl0Var.o();
                return;
            default:
                ScootersPackagesModalView scootersPackagesModalView = (ScootersPackagesModalView) this.b;
                h7o0 h7o0Var = (h7o0) this.c;
                mgo0 mgo0Var = (mgo0) this.w;
                binding = scootersPackagesModalView.getBinding();
                RecyclerView recyclerView = binding.c;
                if (!h7o0Var.a) {
                    for (f7o0 f7o0Var : mgo0Var.a()) {
                        if (!(f7o0Var instanceof c7o0) || !((c7o0) f7o0Var).b) {
                            i5++;
                        }
                    }
                    i2 = -1;
                    recyclerView.scrollToPosition(i2);
                    return;
                }
                h7o0Var.a = false;
                i2 = i5;
                recyclerView.scrollToPosition(i2);
                return;
        }
    }
}
