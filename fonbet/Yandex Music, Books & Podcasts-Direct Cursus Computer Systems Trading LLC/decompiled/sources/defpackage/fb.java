package defpackage;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* loaded from: classes3.dex */
public final class fb extends View.AccessibilityDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 2:
                view.getClass();
                accessibilityEvent.getClass();
                boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((t7f) ((s7f) this.b).g).invoke();
                }
                return dispatchPopulateAccessibilityEvent;
            case 3:
                view.getClass();
                accessibilityEvent.getClass();
                boolean dispatchPopulateAccessibilityEvent2 = super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((r8f) this.b).f.invoke();
                }
                return dispatchPopulateAccessibilityEvent2;
            default:
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo.CollectionInfo obtain;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                view.getClass();
                accessibilityNodeInfo.getClass();
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.RadioGroup");
                int intValue = ((Number) ((b6n) obj).invoke()).intValue();
                axj[] axjVarArr = axj.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    obtain = bb.d(1, intValue);
                } else {
                    obtain = AccessibilityNodeInfo.CollectionInfo.obtain(1, intValue, false, 1);
                    obtain.getClass();
                }
                accessibilityNodeInfo.setCollectionInfo(obtain);
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((rje) obj).h.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    break;
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                break;
        }
    }
}
