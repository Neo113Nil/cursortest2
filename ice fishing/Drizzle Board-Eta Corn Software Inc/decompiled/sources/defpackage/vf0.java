package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vf0 extends vq {
    public final /* synthetic */ int P7K7Inc8;

    public vf0(int i, Class cls, int i2, int i3, int i4) {
        this.P7K7Inc8 = i4;
        this.NCTxEWno = i;
        this.VgvYg0wo = cls;
        this.wxUZMvaN = i2;
        this.MdtA4re8 = i3;
    }

    @Override // defpackage.vq
    public final Object MdtA4re8(View view) {
        switch (this.P7K7Inc8) {
            case 0:
                return Boolean.valueOf(cg0.MdtA4re8(view));
            case 1:
                return cg0.qoPGr6Ce(view);
            default:
                return Boolean.valueOf(cg0.NCTxEWno(view));
        }
    }

    @Override // defpackage.vq
    public final boolean b2ZJblxo(Object obj, Object obj2) {
        switch (this.P7K7Inc8) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }

    @Override // defpackage.vq
    public final void wxUZMvaN(View view, Object obj) {
        switch (this.P7K7Inc8) {
            case 0:
                cg0.P7K7Inc8(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                cg0.VgvYg0wo(view, (CharSequence) obj);
                break;
            default:
                cg0.wxUZMvaN(view, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
