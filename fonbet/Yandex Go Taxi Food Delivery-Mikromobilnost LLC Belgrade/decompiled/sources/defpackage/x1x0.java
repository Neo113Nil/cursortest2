package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.yandex.dsl.views.a;
import com.yandex.dsl.views.layouts.LinearLayoutBuilder;
import com.yandex.messaging.attachments.SystemAttachmentsSelectionUi$special$$inlined$textView$default$1;
import com.yandex.messaging.attachments.SystemAttachmentsSelectionUi$special$$inlined$textView$default$2;
import com.yandex.messaging.attachments.SystemAttachmentsSelectionUi$special$$inlined$textView$default$3;
import com.yandex.messaging.attachments.SystemAttachmentsSelectionUi$special$$inlined$textView$default$4;

/* loaded from: classes15.dex */
public final class x1x0 extends a {
    public final TextView c;
    public final TextView w;
    public final TextView x;
    public final TextView y;

    /* JADX WARN: Multi-variable type inference failed */
    public x1x0(Activity activity) {
        super(activity);
        View view = (View) SystemAttachmentsSelectionUi$special$$inlined$textView$default$1.b.invoke(jh91.e(w0i0.Messaging_MessagePopupButton, activity), 0, 0);
        boolean z = this instanceof kzx;
        if (z) {
            ((kzx) this).addToParent(view);
        }
        TextView textView = (TextView) view;
        textView.setClickable(true);
        textView.setFocusable(true);
        int b = kjs0.b(24);
        textView.setPadding(b, textView.getPaddingTop(), b, textView.getPaddingBottom());
        textView.setGravity(16);
        textView.setText(oyh0.system_attachments_take_photo);
        this.c = textView;
        View view2 = (View) SystemAttachmentsSelectionUi$special$$inlined$textView$default$2.b.invoke(jh91.e(w0i0.Messaging_MessagePopupButton, activity), 0, 0);
        if (z) {
            ((kzx) this).addToParent(view2);
        }
        TextView textView2 = (TextView) view2;
        textView2.setClickable(true);
        textView2.setFocusable(true);
        int b2 = kjs0.b(24);
        textView2.setPadding(b2, textView2.getPaddingTop(), b2, textView2.getPaddingBottom());
        textView2.setGravity(16);
        textView2.setText(oyh0.system_attachments_capture_video);
        this.w = textView2;
        View view3 = (View) SystemAttachmentsSelectionUi$special$$inlined$textView$default$3.b.invoke(jh91.e(w0i0.Messaging_MessagePopupButton, activity), 0, 0);
        if (z) {
            ((kzx) this).addToParent(view3);
        }
        TextView textView3 = (TextView) view3;
        textView3.setClickable(true);
        textView3.setFocusable(true);
        int b3 = kjs0.b(24);
        textView3.setPadding(b3, textView3.getPaddingTop(), b3, textView3.getPaddingBottom());
        textView3.setGravity(16);
        textView3.setText(oyh0.system_attachments_open_gallery);
        this.x = textView3;
        View view4 = (View) SystemAttachmentsSelectionUi$special$$inlined$textView$default$4.b.invoke(jh91.e(w0i0.Messaging_MessagePopupButton, activity), 0, 0);
        if (z) {
            ((kzx) this).addToParent(view4);
        }
        TextView textView4 = (TextView) view4;
        textView4.setClickable(true);
        textView4.setFocusable(true);
        int b4 = kjs0.b(24);
        textView4.setPadding(b4, textView4.getPaddingTop(), b4, textView4.getPaddingBottom());
        textView4.setGravity(16);
        textView4.setText(oyh0.menu_confirm_cancel);
        this.y = textView4;
    }

    @Override // com.yandex.dsl.views.a
    public final View a(jp31 jp31Var) {
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(jh91.e(0, jp31Var.getCtx()), 0, 0);
        if (jp31Var instanceof kzx) {
            ((kzx) jp31Var).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.setOrientation(1);
        linearLayoutBuilder.invoke(this.c, new k720(linearLayoutBuilder, 1));
        linearLayoutBuilder.invoke(this.w, new k720(linearLayoutBuilder, 2));
        linearLayoutBuilder.invoke(this.x, new k720(linearLayoutBuilder, 3));
        linearLayoutBuilder.invoke(this.y, new k720(linearLayoutBuilder, 4));
        return linearLayoutBuilder;
    }
}
