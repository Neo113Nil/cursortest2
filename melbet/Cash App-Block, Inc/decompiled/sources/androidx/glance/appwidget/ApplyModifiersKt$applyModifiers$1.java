package androidx.glance.appwidget;

import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1;
import androidx.glance.BackgroundModifier$Image;
import androidx.glance.GlanceModifier;
import androidx.glance.action.ActionModifier;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.PaddingModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.semantics.SemanticsModifier;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.datadog.android.rum.internal.DatadogLateCrashReporter;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent;
import java.io.Serializable;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final class ApplyModifiersKt$applyModifiers$1 extends Lambda implements Function2 {
    public final /* synthetic */ Object $actionModifier;
    public final /* synthetic */ Serializable $cornerRadius;
    public final /* synthetic */ Serializable $enabled;
    public final /* synthetic */ Serializable $heightModifier;
    public final /* synthetic */ Serializable $paddingModifiers;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $rv;
    public final /* synthetic */ Serializable $semanticsModifier;
    public final /* synthetic */ Object $viewDef;
    public final /* synthetic */ Serializable $widthModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyModifiersKt$applyModifiers$1(DatadogLateCrashReporter datadogLateCrashReporter, String str, String str2, Long l, Long l2, String str3, String str4, ViewEvent viewEvent, DataWriter dataWriter) {
        super(2);
        this.$actionModifier = datadogLateCrashReporter;
        this.$widthModifier = str;
        this.$heightModifier = str2;
        this.$paddingModifiers = l;
        this.$cornerRadius = l2;
        this.$enabled = str3;
        this.$semanticsModifier = str4;
        this.$rv = viewEvent;
        this.$viewDef = dataWriter;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PaddingModifier paddingModifier;
        int i;
        int i2;
        int i3;
        int i4 = this.$r8$classId;
        Object obj3 = this.$viewDef;
        Serializable serializable = this.$semanticsModifier;
        Serializable serializable2 = this.$enabled;
        Serializable serializable3 = this.$cornerRadius;
        Serializable serializable4 = this.$paddingModifiers;
        Serializable serializable5 = this.$heightModifier;
        Serializable serializable6 = this.$widthModifier;
        Object obj4 = this.$actionModifier;
        Object obj5 = this.$rv;
        switch (i4) {
            case 0:
                GlanceModifier.Element element = (GlanceModifier.Element) obj2;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                if (element instanceof ActionModifier) {
                    if (ref$ObjectRef.element != null) {
                        Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    ref$ObjectRef.element = element;
                } else if (element instanceof WidthModifier) {
                    ((Ref$ObjectRef) serializable6).element = element;
                } else if (element instanceof HeightModifier) {
                    ((Ref$ObjectRef) serializable5).element = element;
                } else if (element instanceof BackgroundModifier$Image) {
                    RemoteViews remoteViews = (RemoteViews) obj5;
                    BackgroundModifier$Image backgroundModifier$Image = (BackgroundModifier$Image) element;
                    int i5 = ((InsertedViewInfo) obj3).mainViewId;
                    if (backgroundModifier$Image instanceof BackgroundModifier$Image) {
                        remoteViews.setInt(i5, "setBackgroundResource", backgroundModifier$Image.imageProvider.resId);
                    }
                } else if (element instanceof PaddingModifier) {
                    Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) serializable4;
                    PaddingModifier paddingModifier2 = (PaddingModifier) ref$ObjectRef2.element;
                    if (paddingModifier2 != null) {
                        PaddingModifier paddingModifier3 = (PaddingModifier) element;
                        paddingModifier = new PaddingModifier(paddingModifier2.left.plus(paddingModifier3.left), paddingModifier2.start.plus(paddingModifier3.start), paddingModifier2.top.plus(paddingModifier3.top), paddingModifier2.right.plus(paddingModifier3.right), paddingModifier2.end.plus(paddingModifier3.end), paddingModifier2.bottom.plus(paddingModifier3.bottom));
                    } else {
                        paddingModifier = (PaddingModifier) element;
                    }
                    ref$ObjectRef2.element = paddingModifier;
                } else if (element instanceof CornerRadiusModifier) {
                    ((Ref$ObjectRef) serializable3).element = null;
                } else if (!(element instanceof AlignmentModifier)) {
                    if (element instanceof EnabledModifier) {
                        ((Ref$ObjectRef) serializable2).element = element;
                    } else if (element instanceof SemanticsModifier) {
                        ((Ref$ObjectRef) serializable).element = element;
                    } else {
                        Log.w("GlanceAppWidget", "Unknown modifier '" + element + "', nothing done.");
                    }
                }
                return Unit.INSTANCE;
            default:
                ViewEvent viewEvent = (ViewEvent) obj5;
                DatadogContext datadogContext = (DatadogContext) obj;
                Function1 function1 = (Function1) obj2;
                datadogContext.getClass();
                function1.getClass();
                DatadogLateCrashReporter datadogLateCrashReporter = (DatadogLateCrashReporter) obj4;
                String str = (String) serializable6;
                if (str != null) {
                    try {
                    } catch (NoSuchElementException e) {
                        DBUtil.log$default(datadogLateCrashReporter.sdkCore.getInternalLogger(), 5, InternalLogger.Target.TELEMETRY, new DatadogInterceptor$intercept$1(str, 21), e, false, 48);
                        i2 = 7;
                    }
                    for (int i6 : CameraSelector$$ExternalSyntheticOutline0.values(9)) {
                        if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue(i6).equals(str)) {
                            i2 = i6;
                            i = i2;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } else {
                    i = 7;
                }
                function1.invoke(new AndroidPopup_androidKt$Popup$2$1((DataWriter) obj3, DatadogLateCrashReporter.access$resolveErrorEventFromViewEvent(datadogLateCrashReporter, datadogContext, i, 3, (String) serializable5, ((Long) serializable4).longValue(), (Long) serializable3, (String) serializable2, (String) serializable, null, viewEvent), datadogLateCrashReporter, viewEvent, 1));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyModifiersKt$applyModifiers$1(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Context context, RemoteViews remoteViews, InsertedViewInfo insertedViewInfo, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, TranslationContext translationContext, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, Ref$ObjectRef ref$ObjectRef9) {
        super(2);
        this.$actionModifier = ref$ObjectRef;
        this.$widthModifier = ref$ObjectRef2;
        this.$heightModifier = ref$ObjectRef3;
        this.$rv = remoteViews;
        this.$viewDef = insertedViewInfo;
        this.$paddingModifiers = ref$ObjectRef4;
        this.$cornerRadius = ref$ObjectRef6;
        this.$enabled = ref$ObjectRef8;
        this.$semanticsModifier = ref$ObjectRef9;
    }
}
