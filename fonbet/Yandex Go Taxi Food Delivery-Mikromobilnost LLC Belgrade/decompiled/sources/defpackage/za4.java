package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes15.dex */
public final class za4 {
    public final List a;

    public za4(Context context) {
        this.a = scc.g(new ya4(context.getColor(ipg0.avatar_1_bottom), context.getColor(ipg0.avatar_1_top), context.getColor(ipg0.avatar_text_dark)), new ya4(context.getColor(ipg0.avatar_2_bottom), context.getColor(ipg0.avatar_2_top), context.getColor(ipg0.avatar_text_dark)), new ya4(context.getColor(ipg0.avatar_3_bottom), context.getColor(ipg0.avatar_3_top), context.getColor(ipg0.avatar_text_dark)), new ya4(context.getColor(ipg0.avatar_4_bottom), context.getColor(ipg0.avatar_4_top), context.getColor(ipg0.avatar_text_light)), new ya4(context.getColor(ipg0.avatar_5_bottom), context.getColor(ipg0.avatar_5_top), context.getColor(ipg0.avatar_text_light)), new ya4(context.getColor(ipg0.avatar_6_bottom), context.getColor(ipg0.avatar_6_top), context.getColor(ipg0.avatar_text_light)), new ya4(context.getColor(ipg0.avatar_7_bottom), context.getColor(ipg0.avatar_7_top), context.getColor(ipg0.avatar_text_light)), new ya4(context.getColor(ipg0.avatar_8_bottom), context.getColor(ipg0.avatar_8_top), context.getColor(ipg0.avatar_text_light)), new ya4(context.getColor(ipg0.avatar_9_bottom), context.getColor(ipg0.avatar_9_top), context.getColor(ipg0.avatar_text_light)), new ya4(context.getColor(ipg0.avatar_10_bottom), context.getColor(ipg0.avatar_10_top), context.getColor(ipg0.avatar_text_dark)), new ya4(context.getColor(ipg0.avatar_11_bottom), context.getColor(ipg0.avatar_11_top), context.getColor(ipg0.avatar_text_dark)), new ya4(context.getColor(ipg0.avatar_12_bottom), context.getColor(ipg0.avatar_12_top), context.getColor(ipg0.avatar_text_dark)), new ya4(context.getColor(ipg0.avatar_13_bottom), context.getColor(ipg0.avatar_13_top), context.getColor(ipg0.avatar_text_dark)), new ya4(context.getColor(ipg0.avatar_14_bottom), context.getColor(ipg0.avatar_14_top), context.getColor(ipg0.avatar_text_dark)));
    }

    public final int a(String str) {
        byte[] bytes = str.getBytes(uza.a);
        return (int) Math.abs(drb1.e(bytes.length, bytes) % this.a.size());
    }
}
