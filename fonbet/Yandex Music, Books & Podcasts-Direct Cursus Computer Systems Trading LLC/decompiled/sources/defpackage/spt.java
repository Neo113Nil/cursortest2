package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ru.yandex.music.R;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.mixes.MixesScreenActivity;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public class spt extends bf6 {
    public static final /* synthetic */ int r = 0;
    public TextView k;
    public ImageView l;
    public TextView m;
    public View n;
    public View o;
    public View p;
    public final frt q = (frt) sk3.I(frt.class);

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_url_gag, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.k = (TextView) view.findViewById(R.id.title);
        this.l = (ImageView) view.findViewById(R.id.icon);
        this.m = (TextView) view.findViewById(R.id.subtitle);
        this.n = view.findViewById(R.id.mix);
        this.o = view.findViewById(R.id.url_gag_home_button);
        this.p = view.findViewById(R.id.my_music);
        final int i = 0;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: qpt
            public final /* synthetic */ spt b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                spt sptVar = this.b;
                switch (i2) {
                    case 0:
                        Context context = sptVar.getContext();
                        int i3 = MixesScreenActivity.Y;
                        context.getClass();
                        sptVar.startActivity(new Intent(context, (Class<?>) MixesScreenActivity.class));
                        break;
                    case 1:
                        sptVar.startActivity(MainScreenActivity.J(sptVar.getContext(), rf3.h));
                        break;
                    default:
                        sptVar.startActivity(MainScreenActivity.J(sptVar.getContext(), rf3.l));
                        break;
                }
            }
        });
        final int i2 = 1;
        this.o.setOnClickListener(new View.OnClickListener(this) { // from class: qpt
            public final /* synthetic */ spt b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                spt sptVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = sptVar.getContext();
                        int i3 = MixesScreenActivity.Y;
                        context.getClass();
                        sptVar.startActivity(new Intent(context, (Class<?>) MixesScreenActivity.class));
                        break;
                    case 1:
                        sptVar.startActivity(MainScreenActivity.J(sptVar.getContext(), rf3.h));
                        break;
                    default:
                        sptVar.startActivity(MainScreenActivity.J(sptVar.getContext(), rf3.l));
                        break;
                }
            }
        });
        final int i3 = 2;
        this.p.setOnClickListener(new View.OnClickListener(this) { // from class: qpt
            public final /* synthetic */ spt b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i3;
                spt sptVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = sptVar.getContext();
                        int i32 = MixesScreenActivity.Y;
                        context.getClass();
                        sptVar.startActivity(new Intent(context, (Class<?>) MixesScreenActivity.class));
                        break;
                    case 1:
                        sptVar.startActivity(MainScreenActivity.J(sptVar.getContext(), rf3.h));
                        break;
                    default:
                        sptVar.startActivity(MainScreenActivity.J(sptVar.getContext(), rf3.l));
                        break;
                }
            }
        });
        rpt rptVar = (rpt) Preconditions.nonNull((rpt) getArguments().getSerializable("args.type"));
        this.k.setText(rptVar.b);
        this.l.setImageResource(rptVar.a);
        this.l.setColorFilter(ksw.C(requireContext(), R.attr.iconSecondary));
        boolean a = this.q.c().a();
        View[] viewArr = {this.m, this.n, this.o, this.p};
        jyr jyrVar = sht.a;
        for (int i4 = 0; i4 < 4; i4++) {
            View view2 = viewArr[i4];
            if (view2 != null) {
                view2.setVisibility(a ? 0 : 8);
            }
        }
        q58 q58Var = (q58) getArguments().getParcelable("args.disclaimer");
        if (bundle != null || q58Var == null) {
            return;
        }
        hft hftVar = new hft(9);
        i58 i58Var = new i58();
        i58Var.l = q58Var;
        i58Var.m = hftVar;
        i58Var.n = null;
        i58Var.o = null;
        i58Var.E(getChildFragmentManager());
    }
}
