package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.axc0;
import defpackage.b64;
import defpackage.ba20;
import defpackage.el11;
import defpackage.lw31;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qwc0;
import defpackage.tg;
import defpackage.wor0;
import defpackage.wvc0;
import defpackage.y920;
import defpackage.yvc0;
import defpackage.ywc0;
import defpackage.zwc0;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$ClipboardContentFormat;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.platform.d;
import io.flutter.view.TextureRegistry$SurfaceLifecycle;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class a {
    public final /* synthetic */ Object a;

    public /* synthetic */ a(Object obj) {
        this.a = obj;
    }

    public void a(int i) {
        View view;
        d dVar = (d) this.a;
        if (dVar.g(i)) {
            view = ((g) dVar.C.get(Integer.valueOf(i))).a();
        } else {
            qwc0 qwc0Var = (qwc0) dVar.E.get(i);
            if (qwc0Var == null) {
                nnm.q(i, "Clearing focus on an unknown view with id: ", "PlatformViewsController");
                return;
            }
            view = qwc0Var.getView();
        }
        if (view == null) {
            nnm.q(i, "Clearing focus on a null view with id: ", "PlatformViewsController");
        } else {
            view.clearFocus();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Type inference failed for: r5v11, types: [cxc0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long b(final ywc0 ywc0Var) {
        PlatformViewWrapper platformViewWrapper;
        long id;
        wor0 wor0Var;
        final d dVar = (d) this.a;
        d.b(dVar, ywc0Var);
        double d = ywc0Var.d;
        double d2 = ywc0Var.c;
        int i = ywc0Var.a;
        SparseArray sparseArray = dVar.H;
        if (sparseArray.get(i) != null) {
            ny61.r(oyr.i(i, "Trying to create an already created platform view, view id: "));
            return 0L;
        }
        if (dVar.y == null) {
            ny61.r(oyr.i(i, "Texture registry is null. This means that platform views controller was detached, view id: "));
            return 0L;
        }
        if (dVar.w == null) {
            ny61.r(oyr.i(i, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
            return 0L;
        }
        final int i2 = 1;
        qwc0 c = dVar.c(ywc0Var, true);
        View view = c.getView();
        if (view.getParent() != null) {
            ny61.r("The Android view returned from PlatformView#getView() was already added to a parent view.");
            return 0L;
        }
        if (lw31.c(view, new el11(17, d.Q))) {
            if (ywc0Var.h == PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK) {
                d.f(19);
                if (!dVar.x.IsSurfaceControlEnabled()) {
                    return -2L;
                }
                ny61.r("Trying to create a Hybrid Composition view with HC++ enabled.");
                return 0L;
            }
            if (!dVar.O) {
                d.f(20);
                TextureRegistry$SurfaceProducer b = ((io.flutter.embedding.engine.renderer.f) dVar.y).b(Build.VERSION.SDK_INT <= 34 ? TextureRegistry$SurfaceLifecycle.resetInBackground : TextureRegistry$SurfaceLifecycle.manual);
                wor0 wor0Var2 = new wor0();
                wor0Var2.a = b;
                int p = dVar.p(d2);
                int p2 = dVar.p(d);
                Activity activity = dVar.c;
                tg tgVar = dVar.B;
                int i3 = ywc0Var.a;
                ?? r5 = new View.OnFocusChangeListener() { // from class: cxc0
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        int i4 = i2;
                        ywc0 ywc0Var2 = ywc0Var;
                        d dVar2 = dVar;
                        switch (i4) {
                            case 0:
                                int i5 = ywc0Var2.a;
                                if (!z) {
                                    c cVar = dVar2.z;
                                    if (cVar != null) {
                                        cVar.b(i5);
                                        break;
                                    }
                                } else {
                                    ea20 ea20Var = (ea20) dVar2.A.b;
                                    if (ea20Var != null) {
                                        ea20Var.a("viewFocused", Integer.valueOf(i5), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (z) {
                                    y4a0 y4a0Var = dVar2.A;
                                    int i6 = ywc0Var2.a;
                                    ea20 ea20Var2 = (ea20) y4a0Var.b;
                                    if (ea20Var2 != null) {
                                        ea20Var2.a("viewFocused", Integer.valueOf(i6), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                VirtualDisplay.Callback callback = g.i;
                g gVar = null;
                if (p != 0 && p2 != 0) {
                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    wor0Var2.a(p, p2);
                    VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(oyr.i(i3, "flutter-vd#"), p, p2, displayMetrics.densityDpi, ((TextureRegistry$SurfaceProducer) wor0Var2.a).getSurface(), 0, g.i, null);
                    if (createVirtualDisplay != null) {
                        wor0Var = wor0Var2;
                        gVar = new g(activity, tgVar, createVirtualDisplay, c, wor0Var2, r5, i3);
                        if (gVar == null) {
                            dVar.C.put(Integer.valueOf(i), gVar);
                            View view2 = c.getView();
                            dVar.D.put(view2.getContext(), view2);
                            return ((TextureRegistry$SurfaceProducer) wor0Var.a).id();
                        }
                        throw new IllegalStateException("Failed creating virtual display for a " + ywc0Var.b + " with id: " + i);
                    }
                }
                wor0Var = wor0Var2;
                if (gVar == null) {
                }
            }
        }
        d.f(23);
        int p3 = dVar.p(d2);
        int p4 = dVar.p(d);
        if (dVar.O) {
            platformViewWrapper = new PlatformViewWrapper(dVar.c);
            id = -1;
        } else {
            TextureRegistry$SurfaceProducer b2 = ((io.flutter.embedding.engine.renderer.f) dVar.y).b(Build.VERSION.SDK_INT <= 34 ? TextureRegistry$SurfaceLifecycle.resetInBackground : TextureRegistry$SurfaceLifecycle.manual);
            wor0 wor0Var3 = new wor0();
            wor0Var3.a = b2;
            platformViewWrapper = new PlatformViewWrapper(dVar.c, wor0Var3);
            id = ((TextureRegistry$SurfaceProducer) wor0Var3.a).id();
        }
        platformViewWrapper.setTouchProcessor(dVar.b);
        platformViewWrapper.resizeRenderTarget(p3, p4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(p3, p4);
        int p5 = dVar.p(ywc0Var.e);
        int p6 = dVar.p(ywc0Var.f);
        layoutParams.topMargin = p5;
        layoutParams.leftMargin = p6;
        platformViewWrapper.setLayoutParams(layoutParams);
        View view3 = c.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(p3, p4));
        view3.setImportantForAccessibility(4);
        platformViewWrapper.addView(view3);
        final int i4 = 0;
        platformViewWrapper.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: cxc0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view22, boolean z) {
                int i42 = i4;
                ywc0 ywc0Var2 = ywc0Var;
                d dVar2 = dVar;
                switch (i42) {
                    case 0:
                        int i5 = ywc0Var2.a;
                        if (!z) {
                            c cVar = dVar2.z;
                            if (cVar != null) {
                                cVar.b(i5);
                                break;
                            }
                        } else {
                            ea20 ea20Var = (ea20) dVar2.A.b;
                            if (ea20Var != null) {
                                ea20Var.a("viewFocused", Integer.valueOf(i5), null);
                                break;
                            }
                        }
                        break;
                    default:
                        if (z) {
                            y4a0 y4a0Var = dVar2.A;
                            int i6 = ywc0Var2.a;
                            ea20 ea20Var2 = (ea20) y4a0Var.b;
                            if (ea20Var2 != null) {
                                ea20Var2.a("viewFocused", Integer.valueOf(i6), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        dVar.w.addView(platformViewWrapper);
        sparseArray.append(i, platformViewWrapper);
        FlutterView flutterView = dVar.w;
        if (flutterView == null) {
            return id;
        }
        c.onFlutterViewAttached(flutterView);
        return id;
    }

    public void c(int i) {
        d dVar = (d) this.a;
        SparseArray sparseArray = dVar.F;
        SparseArray sparseArray2 = dVar.H;
        HashMap hashMap = dVar.C;
        SparseArray sparseArray3 = dVar.E;
        qwc0 qwc0Var = (qwc0) sparseArray3.get(i);
        if (qwc0Var == null) {
            nnm.q(i, "Disposing unknown platform view with id: ", "PlatformViewsController");
            return;
        }
        if (qwc0Var.getView() != null) {
            View view = qwc0Var.getView();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        sparseArray3.remove(i);
        try {
            qwc0Var.dispose();
        } catch (RuntimeException e) {
            Log.e("PlatformViewsController", "Disposing platform view threw an exception", e);
        }
        if (dVar.g(i)) {
            g gVar = (g) hashMap.get(Integer.valueOf(i));
            View a = gVar.a();
            if (a != null) {
                dVar.D.remove(a.getContext());
            }
            gVar.a.cancel();
            gVar.a.detachState();
            gVar.h.release();
            gVar.f.release();
            hashMap.remove(Integer.valueOf(i));
            return;
        }
        PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) sparseArray2.get(i);
        if (platformViewWrapper != null) {
            platformViewWrapper.removeAllViews();
            platformViewWrapper.release();
            platformViewWrapper.unsetOnDescendantFocusChangeListener();
            ViewGroup viewGroup2 = (ViewGroup) platformViewWrapper.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(platformViewWrapper);
            }
            sparseArray2.remove(i);
            return;
        }
        FlutterMutatorView flutterMutatorView = (FlutterMutatorView) sparseArray.get(i);
        if (flutterMutatorView != null) {
            flutterMutatorView.removeAllViews();
            flutterMutatorView.unsetOnDescendantFocusChangeListener();
            ViewGroup viewGroup3 = (ViewGroup) flutterMutatorView.getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(flutterMutatorView);
            }
            sparseArray.remove(i);
        }
    }

    public CharSequence d(PlatformChannel$ClipboardContentFormat platformChannel$ClipboardContentFormat) {
        Activity activity = ((yvc0) this.a).a;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip()) {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip != null && (platformChannel$ClipboardContentFormat == null || platformChannel$ClipboardContentFormat == PlatformChannel$ClipboardContentFormat.PLAIN_TEXT)) {
                    ClipData.Item itemAt = primaryClip.getItemAt(0);
                    CharSequence text = itemAt.getText();
                    if (text != null) {
                        return text;
                    }
                    try {
                        Uri uri = itemAt.getUri();
                        if (uri != null && uri.getScheme().equals("content")) {
                            AssetFileDescriptor openTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(activity);
                            if (openTypedAssetFileDescriptor == null) {
                                return coerceToText;
                            }
                            try {
                                openTypedAssetFileDescriptor.close();
                                return coerceToText;
                            } catch (IOException unused) {
                                return coerceToText;
                            }
                        }
                    } catch (IOException unused2) {
                        return text;
                    }
                }
            } catch (FileNotFoundException | IOException | SecurityException unused3) {
                return null;
            }
        }
        return null;
    }

    public void e(double d, double d2, int i) {
        d dVar = (d) this.a;
        if (dVar.g(i)) {
            return;
        }
        PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) dVar.H.get(i);
        if (platformViewWrapper == null) {
            nnm.q(i, "Setting offset for unknown platform view with id: ", "PlatformViewsController");
            return;
        }
        int p = dVar.p(d);
        int p2 = dVar.p(d2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
        layoutParams.topMargin = p;
        layoutParams.leftMargin = p2;
        platformViewWrapper.setLayoutParams(layoutParams);
    }

    public void f(axc0 axc0Var) {
        int i = axc0Var.a;
        d dVar = (d) this.a;
        float f = dVar.c.getResources().getDisplayMetrics().density;
        if (dVar.g(i)) {
            g gVar = (g) dVar.C.get(Integer.valueOf(i));
            MotionEvent o = dVar.o(f, axc0Var, true);
            SingleViewPresentation singleViewPresentation = gVar.a;
            if (singleViewPresentation == null) {
                return;
            }
            singleViewPresentation.dispatchTouchEvent(o);
            return;
        }
        qwc0 qwc0Var = (qwc0) dVar.E.get(i);
        if (qwc0Var == null) {
            nnm.q(i, "Sending touch to an unknown view with id: ", "PlatformViewsController");
            return;
        }
        View view = qwc0Var.getView();
        if (view == null) {
            nnm.q(i, "Sending touch to a null view with id: ", "PlatformViewsController");
        } else {
            view.dispatchTouchEvent(dVar.o(f, axc0Var, false));
        }
    }

    public void g(zwc0 zwc0Var, final y920 y920Var) {
        d dVar = (d) this.a;
        int p = dVar.p(zwc0Var.b);
        int p2 = dVar.p(zwc0Var.c);
        int i = zwc0Var.a;
        if (!dVar.g(i)) {
            qwc0 qwc0Var = (qwc0) dVar.E.get(i);
            PlatformViewWrapper platformViewWrapper = (PlatformViewWrapper) dVar.H.get(i);
            if (qwc0Var == null || platformViewWrapper == null) {
                nnm.q(i, "Resizing unknown platform view with id: ", "PlatformViewsController");
                return;
            }
            if (p > platformViewWrapper.getRenderTargetWidth() || p2 > platformViewWrapper.getRenderTargetHeight()) {
                platformViewWrapper.resizeRenderTarget(p, p2);
            }
            ViewGroup.LayoutParams layoutParams = platformViewWrapper.getLayoutParams();
            layoutParams.width = p;
            layoutParams.height = p2;
            platformViewWrapper.setLayoutParams(layoutParams);
            View view = qwc0Var.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = p;
                layoutParams2.height = p2;
                view.setLayoutParams(layoutParams2);
            }
            int round = (int) Math.round(platformViewWrapper.getRenderTargetWidth() / dVar.j());
            int round2 = (int) Math.round(platformViewWrapper.getRenderTargetHeight() / dVar.j());
            ba20 ba20Var = y920Var.a;
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(round));
            hashMap.put("height", Double.valueOf(round2));
            ba20Var.success(hashMap);
            return;
        }
        final float j = dVar.j();
        final g gVar = (g) dVar.C.get(Integer.valueOf(i));
        io.flutter.plugin.editing.c cVar = dVar.z;
        if (cVar != null) {
            cVar.e();
            SingleViewPresentation singleViewPresentation = gVar.a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                gVar.a.getView().onInputConnectionLocked();
            }
        }
        Runnable runnable = new Runnable() { // from class: io.flutter.plugin.platform.c
            @Override // java.lang.Runnable
            public final void run() {
                d dVar2 = (d) a.this.a;
                io.flutter.plugin.editing.c cVar2 = dVar2.z;
                g gVar2 = gVar;
                if (cVar2 != null) {
                    cVar2.g();
                    SingleViewPresentation singleViewPresentation2 = gVar2.a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        gVar2.a.getView().onInputConnectionUnlocked();
                    }
                }
                double j2 = dVar2.c == null ? j : dVar2.j();
                int round3 = (int) Math.round(((TextureRegistry$SurfaceProducer) gVar2.f.a).getWidth() / j2);
                int round4 = (int) Math.round(((TextureRegistry$SurfaceProducer) gVar2.f.a).getHeight() / j2);
                ba20 ba20Var2 = y920Var.a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("width", Double.valueOf(round3));
                hashMap2.put("height", Double.valueOf(round4));
                ba20Var2.success(hashMap2);
            }
        };
        wor0 wor0Var = gVar.f;
        if (p == ((TextureRegistry$SurfaceProducer) wor0Var.a).getWidth() && p2 == ((TextureRegistry$SurfaceProducer) gVar.f.a).getHeight()) {
            gVar.a().postDelayed(runnable, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View a = gVar.a();
            wor0Var.a(p, p2);
            gVar.h.resize(p, p2, gVar.d);
            gVar.h.setSurface(((TextureRegistry$SurfaceProducer) wor0Var.a).getSurface());
            a.postDelayed(runnable, 0L);
            return;
        }
        boolean isFocused = gVar.a().isFocused();
        e detachState = gVar.a.detachState();
        gVar.h.setSurface(null);
        gVar.h.release();
        DisplayManager displayManager = (DisplayManager) gVar.b.getSystemService("display");
        wor0Var.a(p, p2);
        gVar.h = displayManager.createVirtualDisplay("flutter-vd#" + gVar.e, p, p2, gVar.d, ((TextureRegistry$SurfaceProducer) wor0Var.a).getSurface(), 0, g.i, null);
        View a2 = gVar.a();
        a2.addOnAttachStateChangeListener(new VirtualDisplayController$2(gVar, a2, runnable));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(gVar.b, gVar.h.getDisplay(), gVar.c, detachState, gVar.g, isFocused);
        singleViewPresentation2.show();
        gVar.a.cancel();
        gVar.a = singleViewPresentation2;
    }

    public void h(int i, int i2) {
        View view;
        d dVar = (d) this.a;
        if (i2 != 0 && i2 != 1) {
            ny61.r(b64.d(i2, i, "Trying to set unknown direction value: ", "(view id: ", Extension.C_BRAKE));
            return;
        }
        if (dVar.g(i)) {
            view = ((g) dVar.C.get(Integer.valueOf(i))).a();
        } else {
            qwc0 qwc0Var = (qwc0) dVar.E.get(i);
            if (qwc0Var == null) {
                nnm.q(i, "Setting direction to an unknown view with id: ", "PlatformViewsController");
                return;
            }
            view = qwc0Var.getView();
        }
        if (view == null) {
            nnm.q(i, "Setting direction to a null view with id: ", "PlatformViewsController");
        } else {
            view.setLayoutDirection(i2);
        }
    }

    public void i() {
        yvc0 yvc0Var = (yvc0) this.a;
        View decorView = yvc0Var.a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new PlatformPlugin$2(yvc0Var, decorView));
    }

    public void j(ArrayList arrayList) {
        yvc0 yvc0Var = (yvc0) this.a;
        int i = arrayList.size() == 0 ? 5894 : 1798;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int i3 = wvc0.b[((PlatformChannel$SystemUiOverlay) arrayList.get(i2)).ordinal()];
            if (i3 == 1) {
                i &= -5;
            } else if (i3 == 2) {
                i &= -515;
            }
        }
        yvc0Var.e = i;
        yvc0Var.b();
    }

    public void k(PlatformChannel$HapticFeedbackType platformChannel$HapticFeedbackType) {
        View decorView = ((yvc0) this.a).a.getWindow().getDecorView();
        int i = wvc0.a[platformChannel$HapticFeedbackType.ordinal()];
        if (i == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i == 3) {
            decorView.performHapticFeedback(3);
        } else if (i == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }
}
