package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class ds1 implements rjc, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ds1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        Continuation continuation2 = null;
        final int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fs1) obj2).m((bs1) obj);
                Unit unit = Unit.a;
                nm6 nm6Var = nm6.a;
                return unit;
            case 1:
                ige igeVar = (ige) obj2;
                x97.y(ot0.F(igeVar), null, null, new ptd((cge) obj, igeVar, continuation2, 4), 3);
                Unit unit2 = Unit.a;
                nm6 nm6Var2 = nm6.a;
                return unit2;
            case 2:
                Object m = ((pjq) obj2).a.m((v3k) obj, continuation);
                return m == nm6.a ? m : Unit.a;
            case 3:
                hgp hgpVar = (hgp) obj2;
                int ordinal = ((nrr) obj).ordinal();
                final int i3 = 1;
                if (ordinal == 0) {
                    n3m n3mVar = (n3m) hgpVar.i;
                    if (n3mVar != null) {
                        n3mVar.Q0(false);
                    }
                    final n3m n3mVar2 = (n3m) hgpVar.i;
                    if (n3mVar2 != null) {
                        boolean z = ((String) hgpVar.e) != null;
                        Button button = (Button) n3mVar2.e;
                        ImageView imageView = (ImageView) n3mVar2.c;
                        imageView.setImageResource(R.drawable.ic_check_32);
                        imageView.setColorFilter(ksw.C(imageView.getContext(), R.attr.iconSuccess));
                        TextView textView = (TextView) n3mVar2.d;
                        textView.setText(z ? R.string.feedback_sent_successfully_with_answer : R.string.feedback_sent_successfully_without_answer);
                        button.setText(R.string.button_done);
                        button.setOnClickListener(new View.OnClickListener() { // from class: igp
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                vtm vtmVar;
                                switch (i2) {
                                    case 0:
                                        gao gaoVar = (gao) n3mVar2.f;
                                        if (gaoVar != null && (vtmVar = (vtm) ((hgp) gaoVar.a).h) != null) {
                                            ggp ggpVar = (ggp) vtmVar.a;
                                            t l = ggpVar.l();
                                            if (l != null) {
                                                l.setResult(-1);
                                            }
                                            t l2 = ggpVar.l();
                                            if (l2 != null) {
                                                l2.supportFinishAfterTransition();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        gao gaoVar2 = (gao) n3mVar2.f;
                                        if (gaoVar2 != null) {
                                            ((hgp) gaoVar2.a).y();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        View[] viewArr = {imageView, textView, button};
                        jyr jyrVar = sht.a;
                        for (int i4 = 0; i4 < 3; i4++) {
                            View view = viewArr[i4];
                            if (view != null) {
                                view.setVisibility(0);
                            }
                        }
                    }
                } else if (ordinal == 1) {
                    n3m n3mVar3 = (n3m) hgpVar.i;
                    if (n3mVar3 != null) {
                        n3mVar3.Q0(false);
                    }
                    final n3m n3mVar4 = (n3m) hgpVar.i;
                    if (n3mVar4 != null) {
                        ImageView imageView2 = (ImageView) n3mVar4.c;
                        imageView2.setImageResource(R.drawable.ic_close_32);
                        imageView2.setColorFilter(ksw.C(imageView2.getContext(), R.attr.iconLike));
                        TextView textView2 = (TextView) n3mVar4.d;
                        textView2.setText(R.string.feedback_sending_failed);
                        Button button2 = (Button) n3mVar4.e;
                        button2.setText(R.string.retry);
                        button2.setOnClickListener(new View.OnClickListener() { // from class: igp
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                vtm vtmVar;
                                switch (i3) {
                                    case 0:
                                        gao gaoVar = (gao) n3mVar4.f;
                                        if (gaoVar != null && (vtmVar = (vtm) ((hgp) gaoVar.a).h) != null) {
                                            ggp ggpVar = (ggp) vtmVar.a;
                                            t l = ggpVar.l();
                                            if (l != null) {
                                                l.setResult(-1);
                                            }
                                            t l2 = ggpVar.l();
                                            if (l2 != null) {
                                                l2.supportFinishAfterTransition();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        gao gaoVar2 = (gao) n3mVar4.f;
                                        if (gaoVar2 != null) {
                                            ((hgp) gaoVar2.a).y();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        View[] viewArr2 = {imageView2, textView2, button2};
                        jyr jyrVar2 = sht.a;
                        for (int i5 = 0; i5 < 3; i5++) {
                            View view2 = viewArr2[i5];
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                        }
                    }
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    n3m n3mVar5 = (n3m) hgpVar.i;
                    if (n3mVar5 != null) {
                        n3mVar5.Q0(true);
                    }
                }
                Unit unit3 = Unit.a;
                nm6 nm6Var3 = nm6.a;
                return unit3;
            case 4:
                float floatValue = ((Number) obj).floatValue();
                exr exrVar = (exr) obj2;
                SeekBar seekBar = exrVar.k;
                if (seekBar != null) {
                    int i6 = exrVar.n;
                    int max = seekBar.getMax();
                    int i7 = exrVar.n;
                    int i8 = i6 + ((int) (floatValue * (max - i7)));
                    if (exrVar.m && Math.abs(i7 - i8) > 3) {
                        n7w.O().removeCallbacks(exrVar.o);
                        Timber.d("simulated updates cancelled at %s", Integer.valueOf(exrVar.n));
                        exrVar.m = false;
                    }
                    Timber.d("set progress %s", Integer.valueOf(i8));
                    exrVar.k.setProgress(i8);
                }
                Unit unit4 = Unit.a;
                nm6 nm6Var4 = nm6.a;
                return unit4;
            case 5:
                cge cgeVar = (cge) obj;
                u7s u7sVar = (u7s) obj2;
                cgeVar.getClass();
                u7sVar.b = cgeVar;
                gc8 gc8Var = u7sVar.a;
                if (gc8Var != null) {
                    u7sVar.a(gc8Var);
                }
                Unit unit5 = Unit.a;
                nm6 nm6Var5 = nm6.a;
                return unit5;
            default:
                cyu cyuVar = (cyu) obj2;
                cyuVar.b = ((dc7) cyuVar.a).c(((xxq) obj).a, "wave_settings_notification_dot");
                j0q j0qVar = cyuVar.c;
                Unit unit6 = Unit.a;
                Object emit = j0qVar.emit(unit6, continuation);
                nm6 nm6Var6 = nm6.a;
                if (emit != nm6Var6) {
                    emit = unit6;
                }
                return emit == nm6Var6 ? emit : unit6;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new oj(2, 4, fs1.class, (fs1) this.b, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
            case 1:
                return new oj(2, 4, ige.class, (ige) this.b, "handleInAppRestoreState", "handleInAppRestoreState(Lcom/yandex/music/shared/inapp/restore/api/data/InAppRestoreState;)V");
            case 2:
                return new ezc(2, 0, pjq.class, (pjq) this.b, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            case 3:
                return new oj(2, 4, hgp.class, (hgp) this.b, "handleState", "handleState(Lru/yandex/music/support/SupportCenter$ProgressState;)V");
            case 4:
                return new oj(2, 4, exr.class, (exr) this.b, "updateProgress", "updateProgress(F)V");
            case 5:
                return new oj(2, 4, u7s.class, (u7s) this.b, "setRestorePurchaseState", "setRestorePurchaseState(Lcom/yandex/music/shared/inapp/restore/api/data/InAppRestoreState;)V");
            default:
                return new ezc(2, 0, cyu.class, (cyu) this.b, "onUserChanged", "onUserChanged(Lru/yandex/music/data/user/SmallUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
