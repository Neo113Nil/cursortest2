package androidx.compose.ui.text.platform;

import android.text.Layout;
import android.text.TextPaint;
import androidx.camera.video.Recorder;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.android.StaticLayoutFactory;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Density;
import androidx.emoji2.text.EmojiCompat;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    public final List annotations;
    public final CharSequence charSequence;
    public final Density density;
    public final boolean emojiCompatProcessed;
    public final FontFamilyResolverImpl fontFamilyResolver;
    public final LayoutIntrinsics layoutIntrinsics;
    public final List placeholders;
    public Recorder.AnonymousClass3 resolvedTypefaces;
    public final TextStyle style;
    public final String text;
    public final int textDirectionHeuristic;
    public final AndroidTextPaint textPaint;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AndroidParagraphIntrinsics(java.lang.String r46, androidx.compose.ui.text.TextStyle r47, java.util.List r48, java.util.List r49, androidx.compose.ui.text.font.FontFamilyResolverImpl r50, androidx.compose.ui.unit.Density r51) {
        /*
            Method dump skipped, instructions count: 2558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics.<init>(java.lang.String, androidx.compose.ui.text.TextStyle, java.util.List, java.util.List, androidx.compose.ui.text.font.FontFamilyResolverImpl, androidx.compose.ui.unit.Density):void");
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final boolean getHasStaleResolvedFonts() {
        Recorder.AnonymousClass3 anonymousClass3 = this.resolvedTypefaces;
        if (anonymousClass3 != null ? anonymousClass3.isStaleResolvedFont() : false) {
            return true;
        }
        if (!this.emojiCompatProcessed && EmojiCompatStatus_androidKt.access$getHasEmojiCompat(this.style)) {
            Extras.Key key = EmojiCompatStatus.delegate;
            Extras.Key key2 = EmojiCompatStatus.delegate;
            State state = (State) key2.f61default;
            if (state == null) {
                if (EmojiCompat.isConfigured()) {
                    state = key2.getFontLoadState();
                    key2.f61default = state;
                } else {
                    state = EmojiCompatStatus_androidKt.Falsey;
                }
            }
            if (((Boolean) state.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float getMinIntrinsicWidth() {
        LayoutIntrinsics layoutIntrinsics = this.layoutIntrinsics;
        float f = layoutIntrinsics._minIntrinsicWidth;
        TextPaint textPaint = layoutIntrinsics.textPaint;
        if (!Float.isNaN(f)) {
            return layoutIntrinsics._minIntrinsicWidth;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = layoutIntrinsics.charSequence;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, StaticLayoutFactory.IntRangeComparator);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new IntRange(i, next, 1));
            } else {
                IntRange intRange = (IntRange) priorityQueue.peek();
                if (intRange != null && intRange.last - intRange.first < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new IntRange(i, next, 1));
                }
            }
            i = next;
        }
        boolean isEmpty = priorityQueue.isEmpty();
        float f2 = RecyclerView.DECELERATION_RATE;
        if (!isEmpty) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return RecyclerView.DECELERATION_RATE;
            }
            IntRange intRange2 = (IntRange) it.next();
            f2 = Layout.getDesiredWidth(layoutIntrinsics.getCharSequenceForIntrinsicWidth(), intRange2.first, intRange2.last, textPaint);
            while (it.hasNext()) {
                IntRange intRange3 = (IntRange) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(layoutIntrinsics.getCharSequenceForIntrinsicWidth(), intRange3.first, intRange3.last, textPaint));
            }
        }
        layoutIntrinsics._minIntrinsicWidth = f2;
        return f2;
    }
}
