package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.i;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import ru.yandex.music.R;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Le3a;", "Landroidx/fragment/app/i;", "Lwe;", "<init>", "()V", "flex-document-fragment_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public abstract class e3a extends i implements we {
    public final jyr g = btf.b(new yg6(14, this));

    @Override // defpackage.we
    public final void c(md mdVar) {
        o3a o3aVar = (o3a) this.g.getValue();
        if (o3aVar != null) {
            o3aVar.g(mdVar);
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        Bundle bundle = arguments != null ? arguments.getBundle("query") : null;
        t5a c0 = bundle != null ? gld.c0(bundle) : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("document_label") : null;
        q2a q2aVar = string != null ? (q2a) ((LinkedHashMap) n6a.b.a).get(string) : null;
        o3a o3aVar = (o3a) this.g.getValue();
        if (o3aVar == null) {
            Timber.INSTANCE.e("Engine is null, check if arguments are correct", new Object[0]);
            return;
        }
        if (c0 != null) {
            o3a.i(o3aVar, c0, q2aVar);
        } else if (q2aVar == null) {
            Timber.INSTANCE.e("There is no document or query", new Object[0]);
        } else {
            nnk nnkVar = o3a.Q;
            o3aVar.o(q2aVar);
        }
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("fullscreen", false) : false) {
            setStyle(0, R.style.DocumentDialog_Fullscreen);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog;
        Window window;
        Window window2;
        View decorView;
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        Dialog dialog2 = getDialog();
        View findViewById = (dialog2 == null || (window2 = dialog2.getWindow()) == null || (decorView = window2.getDecorView()) == null) ? null : decorView.findViewById(R.id.touch_outside);
        if (findViewById != null) {
            findViewById.setOnClickListener(null);
        }
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getBoolean("animated", false) : false) && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(R.style.DocumentDialog_SlideBottomAnimation);
        }
        o3a o3aVar = (o3a) this.g.getValue();
        if (o3aVar != null) {
            o3aVar.c(frameLayout, getViewLifecycleOwner());
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.o
    public void onDestroy() {
        Bundle arguments;
        String string;
        super.onDestroy();
        o3a o3aVar = (o3a) this.g.getValue();
        if (o3aVar != null) {
            o3aVar.e();
        }
        if (!h4a.B(this) || (arguments = getArguments()) == null || (string = arguments.getString("document_label")) == null) {
            return;
        }
        n6a.b.n(string);
    }

    @Override // androidx.fragment.app.i
    public final void setCancelable(boolean z) {
        Window window;
        View decorView;
        super.setCancelable(z);
        Dialog dialog = getDialog();
        View findViewById = (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.touch_outside);
        if (findViewById != null) {
            findViewById.setOnClickListener(null);
        }
    }

    public abstract o3a y();
}
