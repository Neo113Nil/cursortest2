package ru.yandex.taxi.widget.text.method;

import android.text.Layout;
import android.text.NoCopySpan;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import defpackage.cly;
import defpackage.dly;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ,2\u00020\u0001:\u0002\u0002-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010\u001dJ'\u0010\"\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+¨\u0006."}, d2 = {"Lru/yandex/taxi/widget/text/method/LinkMovementMethod;", "Landroid/text/method/ScrollingMovementMethod;", "Ldly;", "listener", "<init>", "(Ldly;)V", "", "what", "Landroid/widget/TextView;", "widget", "Landroid/text/Spannable;", "buffer", "", "action", "(ILandroid/widget/TextView;Landroid/text/Spannable;)Z", "Landroid/text/style/ClickableSpan;", "link", "Lzy11;", "onClick", "(Landroid/text/style/ClickableSpan;Landroid/widget/TextView;)V", "canSelectArbitrarily", "()Z", "keyCode", "movementMetaState", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "handleMovementKey", "(Landroid/widget/TextView;Landroid/text/Spannable;IILandroid/view/KeyEvent;)Z", "up", "(Landroid/widget/TextView;Landroid/text/Spannable;)Z", "down", "left", "right", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z", "text", "initialize", "(Landroid/widget/TextView;Landroid/text/Spannable;)V", "view", "dir", "onTakeFocus", "(Landroid/widget/TextView;Landroid/text/Spannable;I)V", "Ldly;", "Companion", "cly", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkMovementMethod extends ScrollingMovementMethod {

    @Deprecated
    public static final int CLICK = 1;

    @Deprecated
    public static final int DOWN = 3;

    @Deprecated
    public static final int UP = 2;
    private final dly listener;
    private static final cly Companion = new cly();
    private static final Object FROM_BELOW = new NoCopySpan.Concrete();

    public LinkMovementMethod(dly dlyVar) {
        this.listener = dlyVar;
    }

    private final boolean action(int what, TextView widget, Spannable buffer) {
        Layout layout = widget.getLayout();
        int totalPaddingBottom = widget.getTotalPaddingBottom() + widget.getTotalPaddingTop();
        int scrollY = widget.getScrollY();
        int height = (widget.getHeight() + scrollY) - totalPaddingBottom;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int lineForVertical2 = layout.getLineForVertical(height);
        int lineStart = layout.getLineStart(lineForVertical);
        int lineEnd = layout.getLineEnd(lineForVertical2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) buffer.getSpans(lineStart, lineEnd, ClickableSpan.class);
        int selectionStart = Selection.getSelectionStart(buffer);
        int selectionEnd = Selection.getSelectionEnd(buffer);
        int min = Math.min(selectionStart, selectionEnd);
        int max = Math.max(selectionStart, selectionEnd);
        if (min < 0 && buffer.getSpanStart(FROM_BELOW) >= 0) {
            min = buffer.length();
            max = min;
        }
        if (min > lineEnd) {
            max = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;
        }
        int i = -1;
        if (max < lineStart) {
            max = -1;
            min = -1;
        }
        if (what == 1) {
            if (min == max) {
                return false;
            }
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) buffer.getSpans(min, max, ClickableSpan.class);
            if (clickableSpanArr2.length != 1) {
                return false;
            }
            onClick(clickableSpanArr2[0], widget);
        } else if (what == 2) {
            int length = clickableSpanArr.length;
            int i2 = -1;
            for (int i3 = 0; i3 < length; i3++) {
                int spanEnd = buffer.getSpanEnd(clickableSpanArr[i3]);
                if ((spanEnd < max || min == max) && spanEnd > i2) {
                    i = buffer.getSpanStart(clickableSpanArr[i3]);
                    i2 = spanEnd;
                }
            }
            if (i >= 0) {
                Selection.setSelection(buffer, i2, i);
                return true;
            }
        } else if (what == 3) {
            int length2 = clickableSpanArr.length;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < length2; i6++) {
                int spanStart = buffer.getSpanStart(clickableSpanArr[i6]);
                if ((spanStart > min || min == max) && spanStart < i5) {
                    i4 = buffer.getSpanEnd(clickableSpanArr[i6]);
                    i5 = spanStart;
                }
            }
            if (i4 < Integer.MAX_VALUE) {
                Selection.setSelection(buffer, i5, i4);
                return true;
            }
        }
        return false;
    }

    private final void onClick(ClickableSpan link, TextView widget) {
        if (this.listener.n(link)) {
            return;
        }
        link.onClick(widget);
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean canSelectArbitrarily() {
        return true;
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public boolean down(TextView widget, Spannable buffer) {
        if (action(3, widget, buffer)) {
            return true;
        }
        return super.down(widget, buffer);
    }

    @Override // android.text.method.BaseMovementMethod
    public boolean handleMovementKey(TextView widget, Spannable buffer, int keyCode, int movementMetaState, KeyEvent event) {
        if ((keyCode == 23 || keyCode == 66) && KeyEvent.metaStateHasNoModifiers(movementMetaState) && event.getAction() == 0 && event.getRepeatCount() == 0 && action(1, widget, buffer)) {
            return true;
        }
        return super.handleMovementKey(widget, buffer, keyCode, movementMetaState, event);
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public void initialize(TextView widget, Spannable text) {
        Selection.removeSelection(text);
        text.removeSpan(FROM_BELOW);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public boolean left(TextView widget, Spannable buffer) {
        if (action(2, widget, buffer)) {
            return true;
        }
        return super.left(widget, buffer);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public void onTakeFocus(TextView view, Spannable text, int dir) {
        Selection.removeSelection(text);
        if ((dir & 1) != 0) {
            text.setSpan(FROM_BELOW, 0, 0, 34);
        } else {
            text.removeSpan(FROM_BELOW);
        }
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        int action = event.getAction();
        if (action == 0 || action == 1) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            int totalPaddingLeft = x - widget.getTotalPaddingLeft();
            int totalPaddingTop = y - widget.getTotalPaddingTop();
            int scrollX = widget.getScrollX() + totalPaddingLeft;
            int scrollY = widget.getScrollY() + totalPaddingTop;
            Layout layout = widget.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (!(clickableSpanArr.length == 0)) {
                if (action == 0) {
                    Selection.setSelection(buffer, buffer.getSpanStart(clickableSpanArr[0]), buffer.getSpanEnd(clickableSpanArr[0]));
                } else if (action == 1) {
                    onClick(clickableSpanArr[0], widget);
                }
                return true;
            }
            Selection.removeSelection(buffer);
        }
        return super.onTouchEvent(widget, buffer, event);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public boolean right(TextView widget, Spannable buffer) {
        if (action(3, widget, buffer)) {
            return true;
        }
        return super.right(widget, buffer);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public boolean up(TextView widget, Spannable buffer) {
        if (action(2, widget, buffer)) {
            return true;
        }
        return super.up(widget, buffer);
    }
}
