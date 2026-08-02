package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.core.os.LocaleListCompat;
import app.cash.molecule.PlatformKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AndroidComposeView$localeList$2 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidComposeView$localeList$2(AndroidComposeView androidComposeView, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        int i = this.$r8$classId;
        AndroidComposeView androidComposeView = this.this$0;
        switch (i) {
            case 0:
                LocaleListCompat locales = PlatformKt.getLocales((Configuration) androidComposeView.configuration$delegate.getValue());
                if (locales.isEmpty()) {
                    locales = LocaleListCompat.getDefault();
                }
                int size = locales.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = locales.get(i2);
                    locale.getClass();
                    arrayList.add(new androidx.compose.ui.text.intl.Locale(locale));
                }
                return new LocaleList(arrayList);
            case 1:
                Boolean bool = (Boolean) androidComposeView.isAttached$delegate.getValue();
                bool.getClass();
                return bool;
            case 2:
                MotionEvent motionEvent = androidComposeView.previousMotionEvent;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.relayoutTime = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.resendMotionEventRunnable);
                }
                return Unit.INSTANCE;
            default:
                JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(androidComposeView._viewTreeOwners$delegate.getValue());
                return null;
        }
    }
}
