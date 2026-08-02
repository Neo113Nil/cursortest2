package com.bugsnag.android;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.CoroutinesRoom;
import app.cash.molecule.PlatformKt;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.trace.TracingHeaderType;
import com.datadog.trace.core.propagation.Baggage;
import java.util.HashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import okhttp3.Request;
import retrofit2.KotlinExtensions$await$2$1;

/* loaded from: classes4.dex */
public final class TombstoneEventEnhancer$invoke$2 extends Lambda implements Function3 {
    public final /* synthetic */ Object $event;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TombstoneEventEnhancer$invoke$2(Set set, TracingInterceptor tracingInterceptor) {
        super(3);
        this.$r8$classId = 4;
        this.$event = set;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fc, code lost:
    
        r4.headers.removeAll(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r5.equals("x-datadog-trace-id") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0115, code lost:
    
        if (r3.contains(com.datadog.android.trace.TracingHeaderType.DATADOG) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0117, code lost:
    
        androidx.room.CoroutinesRoom.Companion.access$replaceHeader(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x011b, code lost:
    
        r4.headers.removeAll(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r5.equals("x-datadog-tags") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r5.equals("traceparent") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r3.contains(com.datadog.android.trace.TracingHeaderType.TRACECONTEXT) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        androidx.room.CoroutinesRoom.Companion.access$replaceHeader(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r4.headers.removeAll(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r5.equals("tracestate") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r5.equals("x-datadog-sampling-priority") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r5.equals("x-datadog-parent-id") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        if (r5.equals("X-B3-SpanId") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        if (r5.equals("X-B3-TraceId") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0109, code lost:
    
        if (r5.equals("x-datadog-origin") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r5.equals("X-B3-Sampled") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00f6, code lost:
    
        if (r3.contains(com.datadog.android.trace.TracingHeaderType.B3MULTI) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f8, code lost:
    
        androidx.room.CoroutinesRoom.Companion.access$replaceHeader(r4, r5, r6);
     */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        String str = null;
        Object obj4 = this.$event;
        switch (i) {
            case 0:
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                ((Event) obj4).addMetadata("Open FileDescriptors", String.valueOf(((Number) obj).intValue()), str3.length() > 0 ? MapsKt__MapsKt.mapOf(new Pair("path", str2), new Pair("owner", str3)) : Thread$State$EnumUnboxingLocalUtility.m("path", str2));
                return Unit.INSTANCE;
            case 1:
                ((Number) obj3).intValue();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(955869654);
                FiniteAnimationSpec finiteAnimationSpec = (FiniteAnimationSpec) obj4;
                gapComposer.end(false);
                return finiteAnimationSpec;
            case 2:
                ((Number) obj3).intValue();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                gapComposer2.startReplaceGroup(374375707);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new PointerInteropFilter();
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) rememberedValue;
                pointerInteropFilter.onTouchEvent = (Function1) obj4;
                KotlinExtensions$await$2$1 kotlinExtensions$await$2$1 = pointerInteropFilter.requestDisallowInterceptTouchEvent;
                if (kotlinExtensions$await$2$1 != null) {
                    kotlinExtensions$await$2$1.$this_await = null;
                }
                pointerInteropFilter.requestDisallowInterceptTouchEvent = null;
                gapComposer2.end(false);
                return pointerInteropFilter;
            case 3:
                Composer composer = ((SkippableUpdater) obj).composer;
                Composer composer2 = (Composer) obj2;
                ((Number) obj3).intValue();
                int hashCode = Long.hashCode(((GapComposer) composer2).compositeKeyHashCode);
                Modifier materializeModifier = PlatformKt.materializeModifier(composer2, (Modifier) obj4);
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceableGroup(509942095);
                ComposeUiNode.Companion.getClass();
                Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                gapComposer3.end(false);
                return Unit.INSTANCE;
            default:
                Request.Builder builder = (Request.Builder) obj;
                String str4 = (String) obj2;
                String str5 = (String) obj3;
                Set set = (Set) obj4;
                builder.getClass();
                str4.getClass();
                str5.getClass();
                switch (str4.hashCode()) {
                    case -1682961930:
                        break;
                    case -1140603879:
                        break;
                    case -344354804:
                        break;
                    case -343637184:
                        if (str4.equals("baggage")) {
                            if (builder.url == null) {
                                throw new IllegalStateException("url == null");
                            }
                            str = builder.headers.build().get("baggage");
                            Baggage from = Baggage.from(str);
                            from.values.putAll(new HashMap(Baggage.from(str5).values));
                            CoroutinesRoom.Companion.access$replaceHeader(builder, str4, from.toString());
                            return Unit.INSTANCE;
                        }
                        CoroutinesRoom.Companion.access$replaceHeader(builder, str4, str5);
                        return Unit.INSTANCE;
                    case 3089:
                        if (str4.equals("b3")) {
                            if (set.contains(TracingHeaderType.B3)) {
                                CoroutinesRoom.Companion.access$replaceHeader(builder, str4, str5);
                            } else {
                                builder.headers.removeAll(str4);
                            }
                            return Unit.INSTANCE;
                        }
                        CoroutinesRoom.Companion.access$replaceHeader(builder, str4, str5);
                        return Unit.INSTANCE;
                    case 304080974:
                        break;
                    case 762897402:
                        break;
                    case 1006622316:
                        break;
                    case 1037578799:
                        break;
                    case 1316815593:
                        break;
                    case 1767467379:
                        break;
                    case 1791641299:
                        break;
                    default:
                        CoroutinesRoom.Companion.access$replaceHeader(builder, str4, str5);
                        return Unit.INSTANCE;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TombstoneEventEnhancer$invoke$2(Object obj, int i) {
        super(3);
        this.$r8$classId = i;
        this.$event = obj;
    }
}
