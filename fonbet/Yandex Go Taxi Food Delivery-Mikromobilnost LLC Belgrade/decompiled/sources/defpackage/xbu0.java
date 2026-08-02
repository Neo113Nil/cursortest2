package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.internal.images.b;

/* loaded from: classes15.dex */
public final class xbu0 extends ybu0 {
    public final ImageView N;
    public final xav O;
    public final int P;
    public String Q;
    public String R;
    public yn50 S;
    public sbu0 T;

    public xbu0(Context context, ViewGroup viewGroup, xav xavVar) {
        super(context, viewGroup, olh0.msg_vh_emoji_sticker_image_item);
        View view = this.a;
        ImageView imageView = (ImageView) view;
        this.N = imageView;
        this.O = xavVar;
        this.P = view.getResources().getDimensionPixelSize(gvg0.emoji_sticker_image_height);
        imageView.setOnClickListener(new eaj0(28, this));
    }

    @Override // defpackage.ybu0
    public final void W(qgn0 qgn0Var) {
        String string = ((vcu0) qgn0Var.b).b.getString(1);
        vcu0 vcu0Var = (vcu0) qgn0Var.b;
        if (!vcu0Var.b.isNull(2)) {
            ny61.r("Check isHeader() first");
            return;
        }
        Cursor cursor = vcu0Var.b;
        String string2 = cursor.getString(3);
        if (vcu0Var.b.isNull(2)) {
            X(string, string2, cursor.getString(4));
        } else {
            ny61.r("Check isHeader() first");
        }
    }

    public final void X(String str, String str2, String str3) {
        String f = b.f(str2);
        ImageView imageView = this.N;
        imageView.setImageDrawable(null);
        g9v load = this.O.load(f);
        int i = wwg0.avatar_placeholder;
        yn50 yn50Var = (yn50) load;
        xn50 xn50Var = yn50Var.b;
        xn50Var.d = i;
        int i2 = this.P;
        xn50Var.i = i2;
        xn50Var.j = i2;
        xn50Var.k = ScaleMode.FIT_CENTER;
        this.S = yn50Var;
        yn50Var.b(imageView, null);
        this.Q = str;
        this.R = str2;
        imageView.setTag(e9h0.tag_sticker_id, str2);
        imageView.setTag(e9h0.tag_sticker_text, str3);
    }

    @Override // defpackage.ybu0
    public final void b() {
        xav xavVar = this.O;
        ImageView imageView = this.N;
        xavVar.c(imageView);
        yn50 yn50Var = this.S;
        if (yn50Var != null) {
            yn50Var.a();
            this.S = null;
        }
        imageView.setImageDrawable(null);
    }
}
