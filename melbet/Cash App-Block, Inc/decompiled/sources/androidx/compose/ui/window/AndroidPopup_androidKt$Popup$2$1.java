package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.rum.internal.DatadogLateCrashReporter;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.ViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt$Popup$2$1 extends Lambda implements Function1 {
    public final /* synthetic */ Object $layoutDirection;
    public final /* synthetic */ Object $onDismissRequest;
    public final /* synthetic */ Object $popupLayout;
    public final /* synthetic */ Object $properties;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$2$1(PopupLayout popupLayout, Function0 function0, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(1);
        this.$r8$classId = 0;
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = function0;
        this.$properties = popupProperties;
        this.$layoutDirection = layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.$r8$classId;
        boolean z = false;
        Object[] objArr = 0;
        Object obj2 = this.$onDismissRequest;
        Object obj3 = this.$popupLayout;
        Object obj4 = this.$properties;
        Object obj5 = this.$layoutDirection;
        switch (i2) {
            case 0:
                PopupLayout popupLayout = (PopupLayout) obj3;
                popupLayout.windowManager.addView(popupLayout, popupLayout.params);
                popupLayout.updateParameters((Function0) obj2, (PopupProperties) obj4, (LayoutDirection) obj5);
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(popupLayout, objArr == true ? 1 : 0);
            case 1:
                EventBatchWriter eventBatchWriter = (EventBatchWriter) obj;
                eventBatchWriter.getClass();
                DataWriter dataWriter = (DataWriter) obj3;
                dataWriter.write(eventBatchWriter, (ErrorEvent) obj2, 2);
                DatadogLateCrashReporter datadogLateCrashReporter = (DatadogLateCrashReporter) obj4;
                ViewEvent viewEvent = (ViewEvent) obj5;
                datadogLateCrashReporter.sdkCore.getTimeProvider().getClass();
                if (System.currentTimeMillis() - viewEvent.date < 14400000) {
                    dataWriter.write(eventBatchWriter, DatadogLateCrashReporter.access$updateViewEvent(datadogLateCrashReporter, viewEvent), 2);
                }
                return Unit.INSTANCE;
            default:
                int intValue = ((Number) obj).intValue();
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj5;
                String str = (String) obj4;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj3;
                int i3 = ref$IntRef2.element;
                Ref$IntRef ref$IntRef3 = (Ref$IntRef) obj2;
                int i4 = ref$IntRef3.element;
                while (ref$IntRef2.element < intValue && ref$IntRef3.element < str.length()) {
                    char charAt = str.charAt(ref$IntRef3.element);
                    if (charAt == ' ') {
                        i = 1;
                    } else if (charAt == '\t') {
                        i = 4 - (ref$IntRef.element % 4);
                    }
                    ref$IntRef2.element += i;
                    ref$IntRef.element += i;
                    ref$IntRef3.element++;
                }
                if (ref$IntRef3.element == str.length()) {
                    ref$IntRef2.element = Integer.MAX_VALUE;
                }
                int i5 = ref$IntRef2.element;
                if (intValue <= i5) {
                    ref$IntRef2.element = i5 - intValue;
                    z = true;
                } else {
                    ref$IntRef3.element = i4;
                    ref$IntRef2.element = i3;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidPopup_androidKt$Popup$2$1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.$r8$classId = i;
        this.$popupLayout = obj;
        this.$onDismissRequest = obj2;
        this.$properties = obj3;
        this.$layoutDirection = obj4;
    }
}
