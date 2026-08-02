package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes15.dex */
public final /* synthetic */ class qhd implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ qhd(View view, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
        this.w = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                view.getLocationInWindow((int[]) obj2);
                ((oz40) obj).setValue(new z5w((r3[0] << 32) | (r3[1] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            default:
                ImageView imageView = (ImageView) view;
                scs0 scs0Var = (scs0) obj2;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                if (imageView.getWidth() > 0 && imageView.getHeight() > 0 && imageView.getDrawable() != null) {
                    scs0Var.invoke(imageView);
                    imageView.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) ref$ObjectRef.element);
                    break;
                }
                break;
        }
        return true;
    }
}
