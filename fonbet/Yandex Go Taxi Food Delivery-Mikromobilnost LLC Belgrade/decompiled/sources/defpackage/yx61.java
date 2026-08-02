package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import com.google.ar.core.exceptions.FatalException;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.lang.reflect.Constructor;
import yads.d02;
import yads.ho0;
import yads.zm0;

/* loaded from: classes7.dex */
public final /* synthetic */ class yx61 implements pn71, ov71, ee71, bx60, ly71 {
    public final /* synthetic */ int a;

    public static /* synthetic */ void e(String str) {
        throw new d02(str);
    }

    public static /* synthetic */ void f(String str) {
        throw new FatalException(str);
    }

    @Override // defpackage.pn71
    public kq71 a(Bundle bundle) {
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        boolean z = true;
        switch (this.a) {
            case 2:
                CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
                CharSequence charSequence2 = charSequence != null ? charSequence : null;
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
                Bitmap bitmap2 = bitmap != null ? bitmap : null;
                if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
                    f = bundle.getFloat(Integer.toString(4, 36));
                    i = bundle.getInt(Integer.toString(5, 36));
                } else {
                    f = -3.4028235E38f;
                    i = Integer.MIN_VALUE;
                }
                int i4 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
                float f3 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
                int i5 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
                if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
                    f2 = bundle.getFloat(Integer.toString(10, 36));
                    i2 = bundle.getInt(Integer.toString(9, 36));
                } else {
                    f2 = -3.4028235E38f;
                    i2 = Integer.MIN_VALUE;
                }
                float f4 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
                float f5 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    i3 = bundle.getInt(Integer.toString(13, 36));
                } else {
                    i3 = ModalContentViewContainer.BASE_SHADOW_COLOR;
                    z = false;
                }
                break;
            case 5:
                if (bundle.getInt(Integer.toString(0, 36), -1) != 3) {
                    w511.q();
                    break;
                } else if (!bundle.getBoolean(Integer.toString(1, 36), false)) {
                    break;
                } else {
                    break;
                }
            default:
                if (bundle.getInt(Integer.toString(0, 36), -1) != 0) {
                    w511.q();
                    break;
                } else if (!bundle.getBoolean(Integer.toString(1, 36), false)) {
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    public String b(no71 no71Var) {
        String str = no71Var.g;
        return str != null ? str : no71Var.a.toString();
    }

    @Override // defpackage.ly71
    public void c(Object obj, hh71 hh71Var) {
        ((ub81) obj).getClass();
    }

    public Constructor d() {
        switch (this.a) {
            case 8:
                int[] iArr = ej71.a;
                if (Boolean.TRUE.equals(Class.forName("com.monetization.ads.exo.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.monetization.ads.exo.ext.flac.FlacExtractor").asSubclass(n771.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = ej71.a;
                return Class.forName("com.monetization.ads.exo.decoder.midi.MidiExtractor").asSubclass(n771.class).getConstructor(null);
        }
    }

    @Override // defpackage.ov71
    public void invoke(Object obj) {
        switch (this.a) {
            case 3:
                ((ub81) obj).getClass();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            default:
                ((b171) obj).getClass();
                break;
            case 11:
                ((ub81) obj).f(new zm0(2, new ho0("Player release timed out."), 1003));
                break;
            case 13:
                ((b171) obj).getClass();
                break;
            case 14:
                ((b171) obj).getClass();
                break;
            case 15:
                ((b171) obj).getClass();
                break;
            case 16:
                ((b171) obj).getClass();
                break;
            case 17:
                ((b171) obj).getClass();
                break;
            case 18:
                ((b171) obj).getClass();
                break;
            case 19:
                ((b171) obj).getClass();
                break;
            case 20:
                ((b171) obj).getClass();
                break;
            case 21:
                ((b171) obj).getClass();
                break;
            case 22:
                ((b171) obj).getClass();
                break;
            case 23:
                ((b171) obj).getClass();
                break;
            case 24:
                ((b171) obj).getClass();
                break;
            case 25:
                ((b171) obj).getClass();
                break;
            case 26:
                ((b171) obj).getClass();
                break;
            case 27:
                ((b171) obj).getClass();
                break;
            case 28:
                ((b171) obj).getClass();
                break;
        }
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), n751Var.a.g(647).d);
        return n751.b;
    }

    public /* synthetic */ yx61(int i) {
        this.a = i;
    }
}
