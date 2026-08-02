package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk9j;", "Ljnb;", "<init>", "()V", "nonmusic-collection-screens"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class k9j extends jnb {
    public final jyr j = btf.b(new i9j(this, 0));
    public final ybf k = new ybf(ern.a(v9j.class), new skf(24, this), new skf(25, new i9j(this, 1)));
    public final jyr l = l18.b.b(hag.I(maj.class), true);
    public final jyr m = btf.b(new i9j(this, 2));
    public final jyr n = btf.b(new i9j(this, 3));
    public final jyr o = btf.b(new i9j(this, 4));
    public final pv9 p = new pv9(24, this);

    public final o15 A() {
        Parcelable parcelable = requireArguments().getParcelable("arg_collection_non_music_type");
        if (parcelable != null) {
            return (o15) parcelable;
        }
        xq0.x("Required value was null.");
        return null;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        composeView.setContent(new wn5(new j9j(this, 0), -1746651761, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return (cvo) this.j.getValue();
    }
}
