package androidx.camera.camera2.pipe.core;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.draw.RotateKt;
import androidx.viewpager.widget.ViewPager;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.Brief;
import com.squareup.cash.moneybot.components.plugins.BriefPlugin;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.util.compose.SharedViewEventsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes3.dex */
public abstract class Debug {
    public static void appendParameters(String str, StringBuilder sb, Map map) {
        String valueOf;
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str.concat("\n"));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof CameraCharacteristics.Key) {
                valueOf = ((CameraCharacteristics.Key) key).getName();
                valueOf.getClass();
            } else if (key instanceof CaptureRequest.Key) {
                valueOf = ((CaptureRequest.Key) key).getName();
                valueOf.getClass();
            } else if (key instanceof CaptureResult.Key) {
                valueOf = ((CaptureResult.Key) key).getName();
                valueOf.getClass();
            } else {
                valueOf = String.valueOf(key);
            }
            Object value = entry.getValue();
            arrayList.add(new Pair(valueOf, value instanceof Object[] ? ArraysKt___ArraysKt.joinToString$default((Object[]) value, null, "[", "]", new BorderKt$$ExternalSyntheticLambda1(7), 25) : String.valueOf(value)));
        }
        for (Pair pair : CollectionsKt.sortedWith(arrayList, new ViewPager.AnonymousClass1(1))) {
            sb.append("  " + StringsKt.padEnd((String) pair.first, 50, ' ') + ' ' + ((String) pair.second) + '\n');
        }
    }

    public static final AmountKeypadState rememberAmountKeypadState(AmountConfig amountConfig, String str, Composer composer, int i, int i2) {
        amountConfig.getClass();
        str.getClass();
        boolean z = (i2 & 16) != 0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-196715102);
        Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer, 1);
        gapComposer.end(false);
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-196712807);
        RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer2.consume(LocalCashVibratorKt.LocalCashVibrator);
        gapComposer2.end(false);
        boolean changed = ((GapComposer) composer).changed(amountConfig);
        boolean z2 = (((i & 112) ^ 48) > 32 && ((GapComposer) composer).changed(str)) || (i & 48) == 32;
        GapComposer gapComposer3 = (GapComposer) composer;
        boolean changed2 = changed | z2 | gapComposer3.changed(rememberShaker) | gapComposer3.changed(realCashVibrator) | ((((57344 & i) ^ 24576) > 16384 && gapComposer3.changed(z)) || (i & 24576) == 16384);
        Object rememberedValue = gapComposer3.rememberedValue();
        if (changed2 || rememberedValue == Composer.Companion.Empty) {
            AmountKeypadState amountKeypadState = new AmountKeypadState(amountConfig, str, rememberShaker, realCashVibrator, z);
            gapComposer3.updateRememberedValue(amountKeypadState);
            rememberedValue = amountKeypadState;
        }
        return (AmountKeypadState) rememberedValue;
    }

    public static Brief toBrief$default(BriefPlugin briefPlugin, com.squareup.protos.cash.kgoose.api.v3.Brief brief, String str) {
        PatternRedaction patternRedaction = new PatternRedaction(str, (String) null, 2);
        try {
            String str2 = brief.title;
            if (str2 == null) {
                throw new IllegalArgumentException("title");
            }
            String str3 = brief.markdown_text;
            if (str3 != null) {
                return new Brief(str, str2, str3);
            }
            throw new IllegalArgumentException("markdown_text");
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.Brief.class), patternRedaction, null);
        }
    }

    public static String unwrapValueAsString(Object obj) {
        JsonLogicList asList = AnyUtilsKt.getAsList(obj);
        if (asList.items.size() > 1) {
            return null;
        }
        Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) asList);
        if (firstOrNull instanceof String) {
            return (String) firstOrNull;
        }
        return null;
    }
}
