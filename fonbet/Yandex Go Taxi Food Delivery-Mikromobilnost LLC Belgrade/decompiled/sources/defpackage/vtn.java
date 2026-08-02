package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.b;
import androidx.emoji2.emojipicker.EmojiPickerView;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.emoji2.emojipicker.ItemType;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class vtn extends RecyclerView.Adapter {
    public Integer A;
    public Integer B;
    public final Context a;
    public final int b;
    public final Float c;
    public final jeu0 w;
    public final bxl x;
    public final loj y;
    public final LayoutInflater z;

    public vtn(Context context, int i, Float f, jeu0 jeu0Var, bxl bxlVar, loj lojVar) {
        this.a = context;
        this.b = i;
        this.c = f;
        this.w = jeu0Var;
        this.x = bxlVar;
        this.y = lojVar;
        this.z = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ztn createEmojiPickerBodyAdapter$lambda$3;
        createEmojiPickerBodyAdapter$lambda$3 = EmojiPickerView.createEmojiPickerBodyAdapter$lambda$3((EmojiPickerView) this.x.b);
        Iterator it = createEmojiPickerBodyAdapter$lambda$3.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((d2x) it.next()).b();
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((ztn) this.x.invoke()).b(i).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((ztn) this.x.invoke()).b(i).b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ztn createEmojiPickerBodyAdapter$lambda$3;
        View view = x0Var.a;
        createEmojiPickerBodyAdapter$lambda$3 = EmojiPickerView.createEmojiPickerBodyAdapter$lambda$3((EmojiPickerView) this.x.b);
        g3x b = createEmojiPickerBodyAdapter$lambda$3.b(i);
        int i2 = ttn.a[ItemType.values()[getItemViewType(i)].ordinal()];
        if (i2 == 1) {
            int i3 = f7h0.category_name;
            WeakHashMap weakHashMap = b.a;
            ((TextView) ((View) rp31.d(view, i3))).setText(((m59) b).c);
            return;
        }
        if (i2 == 2) {
            int i4 = f7h0.emoji_picker_empty_category_view;
            WeakHashMap weakHashMap2 = b.a;
            ((TextView) ((View) rp31.d(view, i4))).setText(((y3c0) b).c);
            return;
        }
        if (i2 != 3) {
            w511.b();
            return;
        }
        sun sunVar = (sun) x0Var;
        String str = ((qun) b).c;
        EmojiView emojiView = sunVar.R;
        emojiView.setEmoji(str);
        tun W = sun.W(str);
        sunVar.S = W;
        if (W.b.isEmpty()) {
            emojiView.setOnLongClickListener(null);
            emojiView.setLongClickable(false);
        } else {
            emojiView.setOnLongClickListener(sunVar.Q);
            emojiView.setLongClickable(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Integer num = this.A;
        if (num == null) {
            num = Integer.valueOf(((viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) / this.b);
        }
        this.A = num;
        Integer num2 = this.B;
        if (num2 == null) {
            Float f = this.c;
            if (f != null) {
                float floatValue = f.floatValue();
                int measuredHeight = viewGroup.getMeasuredHeight();
                Context context = this.a;
                num2 = Integer.valueOf((int) (((measuredHeight - (context.getResources().getDimensionPixelSize(yug0.emoji_picker_category_name_height) * 2)) - context.getResources().getDimensionPixelSize(yug0.emoji_picker_category_name_padding_top)) / floatValue));
            } else {
                num2 = null;
            }
            if (num2 == null) {
                num2 = this.A;
            }
        }
        this.B = num2;
        int i2 = ttn.a[ItemType.values()[i].ordinal()];
        int i3 = 1;
        int i4 = 0;
        LayoutInflater layoutInflater = this.z;
        if (i2 == 1) {
            View inflate = layoutInflater.inflate(gth0.category_text_view, viewGroup, false);
            inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new utn(inflate);
        }
        if (i2 == 2) {
            View inflate2 = layoutInflater.inflate(gth0.empty_category_text_view, viewGroup, false);
            x4e.y(-1, -2, inflate2);
            inflate2.setMinimumHeight(this.B.intValue());
            return new utn(inflate2);
        }
        if (i2 != 3) {
            w511.b();
            return null;
        }
        return new sun(this.a, this.A.intValue(), this.B.intValue(), this.w, new stn(this, i4), new stn(this, i3));
    }
}
