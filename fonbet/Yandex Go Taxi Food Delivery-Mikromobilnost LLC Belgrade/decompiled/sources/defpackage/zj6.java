package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.alicekit.core.views.SimpleViewStub;
import com.yandex.dsl.views.a;
import com.yandex.dsl.views.layouts.FrameLayoutBuilder;
import com.yandex.dsl.views.layouts.LinearLayoutBuilder;
import com.yandex.messaging.input.voice.reply.VoiceMessageReplyController$playerBrick$lambda$5$$inlined$textView$default$1;
import com.yandex.messaging.input.voice.reply.VoiceMessageReplyController$waitBrick$lambda$3$lambda$2$$inlined$progressBar$default$1;
import com.yandex.messaging.ui.timeline.Preview$_init_$lambda$8$lambda$4$lambda$3$$inlined$textView$default$1;
import com.yandex.messaging.ui.timeline.Preview$_init_$lambda$8$lambda$4$lambda$3$$inlined$textView$default$2;
import com.yandex.messaging.ui.timeline.Preview$_init_$lambda$8$lambda$7$lambda$6$$inlined$textView$default$1;

/* loaded from: classes15.dex */
public final class zj6 extends a {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj6(Context context, int i) {
        super(context);
        this.c = i;
    }

    @Override // com.yandex.dsl.views.a
    public final View a(jp31 jp31Var) {
        switch (this.c) {
            case 0:
                SimpleViewStub simpleViewStub = new SimpleViewStub(jp31Var.getCtx(), null, 0, 6, null);
                simpleViewStub.setVisibility(8);
                return simpleViewStub;
            case 1:
                LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(jh91.e(0, jp31Var.getCtx()), 0, 0);
                if (jp31Var instanceof kzx) {
                    ((kzx) jp31Var).addToParent(linearLayoutBuilder);
                }
                linearLayoutBuilder.setOrientation(0);
                View view = (View) Preview$_init_$lambda$8$lambda$4$lambda$3$$inlined$textView$default$1.b.invoke(jh91.e(0, linearLayoutBuilder.getCtx()), 0, 0);
                linearLayoutBuilder.addToParent(view);
                ((TextView) view).setText("<-");
                View view2 = (View) Preview$_init_$lambda$8$lambda$4$lambda$3$$inlined$textView$default$2.b.invoke(jh91.e(0, linearLayoutBuilder.getCtx()), 0, 0);
                linearLayoutBuilder.addToParent(view2);
                TextView textView = (TextView) view2;
                textView.setText("My Toolbar");
                ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder.generateLayoutParams(-2, -2);
                ((LinearLayout.LayoutParams) generateLayoutParams).weight = 1.0f;
                textView.setLayoutParams(generateLayoutParams);
                return linearLayoutBuilder;
            case 2:
                View view3 = (View) Preview$_init_$lambda$8$lambda$7$lambda$6$$inlined$textView$default$1.b.invoke(jh91.e(0, jp31Var.getCtx()), 0, 0);
                if (jp31Var instanceof kzx) {
                    ((kzx) jp31Var).addToParent(view3);
                }
                TextView textView2 = (TextView) view3;
                textView2.setText("message1\nmessage2\nmessage3\nmessage4\nmessage5\nmessage6\n");
                return textView2;
            case 3:
                View view4 = (View) VoiceMessageReplyController$playerBrick$lambda$5$$inlined$textView$default$1.b.invoke(jh91.e(0, jp31Var.getCtx()), 0, 0);
                if (jp31Var instanceof kzx) {
                    ((kzx) jp31Var).addToParent(view4);
                }
                TextView textView3 = (TextView) view4;
                int b = kjs0.b(15);
                textView3.setPadding(b, textView3.getPaddingTop(), b, textView3.getPaddingBottom());
                textView3.setText(oyh0.voice_message_placeholder_text);
                return textView3;
            default:
                FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(jh91.e(0, jp31Var.getCtx()), 0, 0);
                if (jp31Var instanceof kzx) {
                    ((kzx) jp31Var).addToParent(frameLayoutBuilder);
                }
                frameLayoutBuilder.setMinimumHeight(kjs0.a(57.0f));
                View view5 = (View) VoiceMessageReplyController$waitBrick$lambda$3$lambda$2$$inlined$progressBar$default$1.b.invoke(jh91.e(0, frameLayoutBuilder.getCtx()), 0, 0);
                frameLayoutBuilder.addToParent(view5);
                ProgressBar progressBar = (ProgressBar) view5;
                progressBar.setIndeterminate(true);
                ViewGroup.LayoutParams generateLayoutParams2 = frameLayoutBuilder.generateLayoutParams(-2, -2);
                ((FrameLayout.LayoutParams) generateLayoutParams2).gravity = 17;
                progressBar.setLayoutParams(generateLayoutParams2);
                return frameLayoutBuilder;
        }
    }
}
