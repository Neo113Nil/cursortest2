package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt2a;", "Laf3;", "Lwe;", "Lytc;", "<init>", "()V", "flex-document-fragment_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public abstract class t2a extends af3 implements we, ytc {
    public final Object g = btf.a(bwf.c, new yg6(13, this));

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public final o3a A() {
        return (o3a) this.g.getValue();
    }

    public final void B() {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("close_on_tap_outside", false) : false;
        Dialog dialog = getDialog();
        View view = null;
        View findViewById = (dialog == null || (window2 = dialog.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) ? null : decorView2.findViewById(R.id.touch_outside);
        if (z) {
            if (findViewById != null) {
                findViewById.setOnClickListener(new ol(13, this));
            }
        } else if (findViewById != null) {
            findViewById.setOnClickListener(null);
        }
        Bundle arguments2 = getArguments();
        boolean z2 = arguments2 != null ? arguments2.getBoolean("close_on_slide_down", false) : false;
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            view = decorView.findViewById(R.id.design_bottom_sheet);
        }
        if (view != null) {
            BottomSheetBehavior.from(view).setHideable(z2);
        }
    }

    @Override // defpackage.we
    public final void c(md mdVar) {
        o3a A = A();
        if (A != null) {
            A.g(mdVar);
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        getParentFragmentManager().o.add(this);
        Bundle arguments = getArguments();
        Bundle bundle = arguments != null ? arguments.getBundle("query") : null;
        t5a c0 = bundle != null ? gld.c0(bundle) : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("document_label") : null;
        q2a q2aVar = string != null ? (q2a) ((LinkedHashMap) n6a.b.a).get(string) : null;
        o3a A = A();
        if (A == null) {
            Timber.INSTANCE.e("Engine is null, check if arguments are correct", new Object[0]);
            return;
        }
        if (c0 != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null ? arguments3.getBoolean("should_load_by_query", false) : false) {
                o3a.i(A, c0, q2aVar);
                return;
            }
        }
        if (q2aVar == null) {
            Timber.INSTANCE.e("There is no document or query", new Object[0]);
        } else {
            nnk nnkVar = o3a.Q;
            A.o(q2aVar);
        }
    }

    @Override // defpackage.ytc
    public final void onBackStackChanged() {
        o3a A;
        if (!isStateSaved() && Intrinsics.d(CollectionsKt.Z(getParentFragmentManager().c.f()), this) && (A = A()) != null && A.J) {
            xq0.q("Can't trim document after destroy");
        }
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        A();
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("dim_background", false) : false) {
            setStyle(1, R.style.DocumentBottomSheet_Dimmed);
        } else {
            setStyle(1, R.style.DocumentBottomSheet_Transparent);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog;
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        B();
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getBoolean("fullscreen", false) : false) && (dialog = getDialog()) != null) {
            dialog.setOnShowListener(new s2a());
        }
        Dialog dialog2 = getDialog();
        KeyEvent.Callback findViewById = dialog2 != null ? dialog2.findViewById(R.id.design_bottom_sheet) : null;
        FrameLayout frameLayout2 = findViewById instanceof FrameLayout ? (FrameLayout) findViewById : null;
        if (frameLayout2 != null) {
            BottomSheetBehavior.from(frameLayout2).addBottomSheetCallback(new xe3(3, this));
        }
        o3a A = A();
        if (A != null) {
            A.c(frameLayout, getViewLifecycleOwner());
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.o
    public void onDestroy() {
        Bundle arguments;
        String string;
        super.onDestroy();
        o3a A = A();
        if (A != null) {
            A.e();
        }
        if (!h4a.B(this) || (arguments = getArguments()) == null || (string = arguments.getString("document_label")) == null) {
            return;
        }
        n6a.b.n(string);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDetach() {
        getParentFragmentManager().o.remove(this);
        super.onDetach();
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        View decorView;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        float f = arguments != null ? arguments.getFloat("default_height", 0.0f) : 0.0f;
        y38 y38Var = a48.a;
        int i = new t38(f).b;
        if (i > 0) {
            Dialog dialog = getDialog();
            View findViewById = (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.design_bottom_sheet);
            if (findViewById != null) {
                BottomSheetBehavior.from(findViewById).setPeekHeight(i);
            }
        }
    }

    @Override // androidx.fragment.app.i
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        B();
    }

    public abstract o3a z();
}
