package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;
import ru.yandex.music.ui.view.ImageSpannableEllipsizedTextView;
import ru.yandex.music.ui.view.RoundedOutlineProviderImageView;
import ru.yandex.music.ui.view.SquaredByWidthShapeableImageView;
import ru.yandex.music.ui.view.YaRotatingProgress;

/* loaded from: classes4.dex */
public final class o8f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ o8f(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = view.findViewById(R.id.bottom_dialog_header_subtitle);
                    if (findViewById != null) {
                        return (ImageSpannableEllipsizedTextView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type ru.yandex.music.ui.view.ImageSpannableEllipsizedTextView");
                } catch (ClassCastException e) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar), e);
                    return null;
                }
            case 1:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = view.findViewById(R.id.bottom_dialog_header_cover);
                    if (findViewById2 != null) {
                        return (RoundedOutlineProviderImageView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type ru.yandex.music.ui.view.RoundedOutlineProviderImageView");
                } catch (ClassCastException e2) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar2), e2);
                    return null;
                }
            case 2:
                s9f s9fVar3 = (s9f) obj;
                s9fVar3.getClass();
                try {
                    View findViewById3 = view.findViewById(R.id.bottom_dialog_loading_placeholder);
                    if (findViewById3 != null) {
                        return findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e3) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar3), e3);
                    return null;
                }
            case 3:
                s9f s9fVar4 = (s9f) obj;
                s9fVar4.getClass();
                try {
                    View findViewById4 = view.findViewById(R.id.bottom_dialog_loading_progress);
                    if (findViewById4 != null) {
                        return (YaRotatingProgress) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type ru.yandex.music.ui.view.YaRotatingProgress");
                } catch (ClassCastException e4) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar4), e4);
                    return null;
                }
            case 4:
                s9f s9fVar5 = (s9f) obj;
                s9fVar5.getClass();
                try {
                    View findViewById5 = view.findViewById(R.id.rup_settings_title_text_view);
                    if (findViewById5 != null) {
                        return (TextView) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e5) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar5), e5);
                    return null;
                }
            case 5:
                s9f s9fVar6 = (s9f) obj;
                s9fVar6.getClass();
                try {
                    View findViewById6 = view.findViewById(R.id.rup_settings_context_text_view);
                    if (findViewById6 != null) {
                        return (TextView) findViewById6;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e6) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar6), e6);
                    return null;
                }
            case 6:
                s9f s9fVar7 = (s9f) obj;
                s9fVar7.getClass();
                try {
                    View findViewById7 = view.findViewById(R.id.rup_settings_lang_text_view);
                    if (findViewById7 != null) {
                        return (TextView) findViewById7;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e7) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar7), e7);
                    return null;
                }
            case 7:
                s9f s9fVar8 = (s9f) obj;
                s9fVar8.getClass();
                try {
                    View findViewById8 = view.findViewById(R.id.rup_settings_context_recycler);
                    if (findViewById8 != null) {
                        return (RecyclerView) findViewById8;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                } catch (ClassCastException e8) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar8), e8);
                    return null;
                }
            case 8:
                s9f s9fVar9 = (s9f) obj;
                s9fVar9.getClass();
                try {
                    View findViewById9 = view.findViewById(R.id.rup_settings_lang_recycler);
                    if (findViewById9 != null) {
                        return (RecyclerView) findViewById9;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                } catch (ClassCastException e9) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar9), e9);
                    return null;
                }
            case 9:
                s9f s9fVar10 = (s9f) obj;
                s9fVar10.getClass();
                try {
                    View findViewById10 = view.findViewById(R.id.rup_settings_clear_button);
                    if (findViewById10 != null) {
                        return (Button) findViewById10;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e10) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar10), e10);
                    return null;
                }
            case 10:
                s9f s9fVar11 = (s9f) obj;
                s9fVar11.getClass();
                try {
                    View findViewById11 = view.findViewById(R.id.rup_settings_progress_view);
                    if (findViewById11 != null) {
                        return (com.yandex.music.myvibe.settings.ui.view.YaRotatingProgress) findViewById11;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.music.myvibe.settings.ui.view.YaRotatingProgress");
                } catch (ClassCastException e11) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar11), e11);
                    return null;
                }
            case 11:
                s9f s9fVar12 = (s9f) obj;
                s9fVar12.getClass();
                try {
                    View findViewById12 = view.findViewById(R.id.container_no_result);
                    if (findViewById12 != null) {
                        return findViewById12;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e12) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar12), e12);
                    return null;
                }
            case 12:
                s9f s9fVar13 = (s9f) obj;
                s9fVar13.getClass();
                try {
                    View findViewById13 = view.findViewById(R.id.no_connection_root);
                    if (findViewById13 != null) {
                        return (ViewGroup) findViewById13;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e13) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar13), e13);
                    return null;
                }
            case 13:
                s9f s9fVar14 = (s9f) obj;
                s9fVar14.getClass();
                try {
                    View findViewById14 = view.findViewById(R.id.toolbar);
                    if (findViewById14 != null) {
                        return findViewById14;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e14) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar14), e14);
                    return null;
                }
            case 14:
                s9f s9fVar15 = (s9f) obj;
                s9fVar15.getClass();
                try {
                    View findViewById15 = view.findViewById(R.id.item_podcast_root);
                    if (findViewById15 != null) {
                        return findViewById15;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e15) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar15), e15);
                    return null;
                }
            case 15:
                s9f s9fVar16 = (s9f) obj;
                s9fVar16.getClass();
                try {
                    View findViewById16 = view.findViewById(R.id.img_cover);
                    if (findViewById16 != null) {
                        return (SquaredByWidthShapeableImageView) findViewById16;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type ru.yandex.music.ui.view.SquaredByWidthShapeableImageView");
                } catch (ClassCastException e16) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar16), e16);
                    return null;
                }
            case 16:
                s9f s9fVar17 = (s9f) obj;
                s9fVar17.getClass();
                try {
                    View findViewById17 = view.findViewById(R.id.txt_title);
                    if (findViewById17 != null) {
                        return (TextView) findViewById17;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e17) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar17), e17);
                    return null;
                }
            case 17:
                s9f s9fVar18 = (s9f) obj;
                s9fVar18.getClass();
                try {
                    View findViewById18 = view.findViewById(R.id.txt_subtitle);
                    if (findViewById18 != null) {
                        return (TextView) findViewById18;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e18) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar18), e18);
                    return null;
                }
            case 18:
                s9f s9fVar19 = (s9f) obj;
                s9fVar19.getClass();
                try {
                    View findViewById19 = view.findViewById(R.id.explicit_mark);
                    if (findViewById19 != null) {
                        return (x9e) findViewById19;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type ru.yandex.music.ui.view.IcExplicitView");
                } catch (ClassCastException e19) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar19), e19);
                    return null;
                }
            case 19:
                s9f s9fVar20 = (s9f) obj;
                s9fVar20.getClass();
                try {
                    return (TextView) view.findViewById(R.id.txt_place);
                } catch (ClassCastException e20) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar20), e20);
                    return null;
                }
            case 20:
                s9f s9fVar21 = (s9f) obj;
                s9fVar21.getClass();
                try {
                    return (LinearLayout) view.findViewById(R.id.position_block);
                } catch (ClassCastException e21) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar21), e21);
                    return null;
                }
            case 21:
                s9f s9fVar22 = (s9f) obj;
                s9fVar22.getClass();
                try {
                    return (ImageView) view.findViewById(R.id.icon);
                } catch (ClassCastException e22) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar22), e22);
                    return null;
                }
            case 22:
                s9f s9fVar23 = (s9f) obj;
                s9fVar23.getClass();
                try {
                    View findViewById20 = view.findViewById(R.id.podcast_plus_badge_image_view);
                    if (findViewById20 != null) {
                        return (ImageView) findViewById20;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                } catch (ClassCastException e23) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar23), e23);
                    return null;
                }
            case 23:
                s9f s9fVar24 = (s9f) obj;
                s9fVar24.getClass();
                try {
                    View findViewById21 = view.findViewById(R.id.plus_panel);
                    if (findViewById21 != null) {
                        return (ComposeView) findViewById21;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                } catch (ClassCastException e24) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar24), e24);
                    return null;
                }
            case 24:
                s9f s9fVar25 = (s9f) obj;
                s9fVar25.getClass();
                try {
                    View findViewById22 = view.findViewById(R.id.easy_login_button);
                    if (findViewById22 != null) {
                        return (ComposeView) findViewById22;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                } catch (ClassCastException e25) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar25), e25);
                    return null;
                }
            case 25:
                s9f s9fVar26 = (s9f) obj;
                s9fVar26.getClass();
                try {
                    View findViewById23 = view.findViewById(R.id.avatar_icon);
                    if (findViewById23 != null) {
                        return (ComposeView) findViewById23;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                } catch (ClassCastException e26) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar26), e26);
                    return null;
                }
            case 26:
                s9f s9fVar27 = (s9f) obj;
                s9fVar27.getClass();
                try {
                    View findViewById24 = view.findViewById(R.id.text_view_name);
                    if (findViewById24 != null) {
                        return (TextView) findViewById24;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e27) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar27), e27);
                    return null;
                }
            case 27:
                s9f s9fVar28 = (s9f) obj;
                s9fVar28.getClass();
                try {
                    View findViewById25 = view.findViewById(R.id.text_view_login);
                    if (findViewById25 != null) {
                        return (TextView) findViewById25;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e28) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar28), e28);
                    return null;
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                s9f s9fVar29 = (s9f) obj;
                s9fVar29.getClass();
                try {
                    View findViewById26 = view.findViewById(R.id.subscription_action_list);
                    if (findViewById26 != null) {
                        return (RecyclerView) findViewById26;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                } catch (ClassCastException e29) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar29), e29);
                    return null;
                }
            default:
                s9f s9fVar30 = (s9f) obj;
                s9fVar30.getClass();
                try {
                    View findViewById27 = view.findViewById(R.id.progress);
                    if (findViewById27 != null) {
                        return findViewById27;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e30) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar30), e30);
                    return null;
                }
        }
    }
}
