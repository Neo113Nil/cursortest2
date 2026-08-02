package com.miteksystems.misnap.core;

import android.util.Log;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.investing.components.stock.details.SineWave;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public abstract class DateUtil {
    /* renamed from: MooncakeInvestingPreIpoGraph-FNF3uiM, reason: not valid java name */
    public static final void m2164MooncakeInvestingPreIpoGraphFNF3uiM(Modifier modifier, State state, long j, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-975153312);
        int i2 = i | 16 | (gapComposer.changed(j) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                Duration.Companion companion = Duration.Companion;
                state = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition(null, gapComposer, 1), RecyclerView.DECELERATION_RATE, 1.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default((int) Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(2, DurationUnit.SECONDS)), 0, EasingKt.LinearEasing, 2), RepeatMode.Restart, 4), null, gapComposer, 4536, 8);
            } else {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            SineWave sineWave = new SineWave(j);
            Modifier clipToBounds = ClipKt.clipToBounds(modifier);
            boolean changed = gapComposer.changed(sineWave) | gapComposer.changed(state);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda10(29, sineWave, state);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SpacerKt.Spacer(gapComposer, ClipKt.drawWithCache(clipToBounds, (Function1) rememberedValue));
        } else {
            gapComposer.skipToGroupEnd();
        }
        State state2 = state;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayPaymentKt$$ExternalSyntheticLambda3(i, 9, j, modifier, (Object) state2);
        }
    }

    public static /* synthetic */ String formatDate$core_release(long j, String str) {
        String format2;
        if (j != Long.MIN_VALUE) {
            try {
                format2 = getUtcDateFormat(str).format(new Date(j));
            } catch (Exception e) {
                Log.e("DateUtils", "Failed to format date", e);
                return "";
            }
        } else {
            format2 = "";
        }
        format2.getClass();
        return format2;
    }

    public static final Calendar getUtcCalendar() {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        timeZone.getClass();
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.getClass();
        return calendar;
    }

    public static final SimpleDateFormat getUtcDateFormat(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        timeZone.getClass();
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat;
    }

    public static void isTrue(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void notNull(Object obj, String str, Object... objArr) {
        if (obj == null) {
            throw new NullPointerException(String.format(str, objArr));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r3 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return getUtcCalendar().getTimeInMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r3 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long parseDate(String str, String str2, boolean z, boolean z2) {
        if (str != null && !StringsKt.isBlank(str)) {
            try {
                Date parse = getUtcDateFormat(str2).parse(str);
                if (parse != null) {
                    if (z2 && parse.after(getUtcCalendar().getTime())) {
                        long time = parse.getTime();
                        Calendar utcCalendar = getUtcCalendar();
                        utcCalendar.setTimeInMillis(time);
                        utcCalendar.add(1, -100);
                        parse = utcCalendar.getTime();
                    }
                    if (parse != null) {
                        return parse.getTime();
                    }
                }
                if (z) {
                    return getUtcCalendar().getTimeInMillis();
                }
            } catch (Exception unused) {
            }
            return Long.MIN_VALUE;
        }
    }
}
