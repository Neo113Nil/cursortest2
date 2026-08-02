package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.emoji2.emojipicker.a;
import androidx.recyclerview.widget.x0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class sun extends x0 {
    public final jeu0 N;
    public final stn O;
    public final stn P;
    public final run Q;
    public final EmojiView R;
    public tun S;
    public zrm T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sun(Context context, int i, int i2, jeu0 jeu0Var, stn stnVar, stn stnVar2) {
        super(r0);
        EmojiView emojiView = new EmojiView(context, null, 2, null);
        this.N = jeu0Var;
        this.O = stnVar;
        this.P = stnVar2;
        this.Q = new run(0, this, context);
        emojiView.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        emojiView.setClickable(true);
        emojiView.setOnClickListener(new cmi(18, this));
        this.R = emojiView;
    }

    public static tun W(String str) {
        LinkedHashMap linkedHashMap = a.c;
        if (linkedHashMap == null) {
            ny61.r("BundledEmojiListLoader.load is not called or complete");
            return null;
        }
        List list = (List) linkedHashMap.get(str);
        if (list == null) {
            list = EmptyList.a;
        }
        return new tun(str, list);
    }
}
