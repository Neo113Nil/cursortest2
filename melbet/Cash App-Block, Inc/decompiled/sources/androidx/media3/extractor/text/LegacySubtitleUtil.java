package androidx.media3.extractor.text;

import androidx.glance.layout.ColumnKt;
import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.SubtitleParser;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.cdf.customersupport.Channel;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessOpenNode;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewContactOptions;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactStart;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.SupportHomeViewEvent;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.slf4j.Logger;

/* loaded from: classes3.dex */
public abstract class LegacySubtitleUtil {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayAppletRetroOrderSelection.deepLinkSpecs;
    }

    public static final void logTapSupportChat(Analytics analytics, SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen, Boolean bool) {
        supportHomeScreen.getClass();
        Channel channel = Channel.CHAT;
        SupportScreens.FlowScreens.Data data = supportHomeScreen.data;
        String str = data.flowToken;
        CustomerSupportContactStart.Trigger trigger = CustomerSupportContactStart.Trigger.HOME;
        String str2 = data.paymentToken;
        String str3 = supportHomeScreen.nodeToken;
        if (str3 == null) {
            str3 = Logger.ROOT_LOGGER_NAME;
        }
        analytics.track(new CustomerSupportContactStart(channel, str, trigger, str2, str3, null, null, null, bool, 224), null);
    }

    public static final void logTapSupportFlowNode(Analytics analytics, SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen, SupportHomeViewEvent supportHomeViewEvent, List list, List list2, String str) {
        Integer valueOf;
        Integer num;
        String str2;
        String str3;
        String str4;
        CustomerSupportAccessOpenNode.SelectedType selectedType;
        String str5;
        supportHomeScreen.getClass();
        SupportScreens.FlowScreens.Data data = supportHomeScreen.data;
        supportHomeViewEvent.getClass();
        str.getClass();
        int i = -1;
        int i2 = 0;
        if (supportHomeViewEvent instanceof SupportHomeViewEvent.CategoryClicked) {
            valueOf = list != null ? Integer.valueOf(list.size()) : null;
            CustomerSupportAccessOpenNode.SelectedType selectedType2 = CustomerSupportAccessOpenNode.SelectedType.NODE_TREE;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(((SupportHomeViewEvent.CategoryClicked) supportHomeViewEvent).token, ((SupportHomeViewModel.Category) it.next()).token)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            str3 = ((SupportHomeViewEvent.CategoryClicked) supportHomeViewEvent).token;
            str4 = null;
            str5 = null;
            selectedType = selectedType2;
        } else {
            if (!(supportHomeViewEvent instanceof SupportHomeViewEvent.SuggestedActionClicked)) {
                a$$ExternalSyntheticBUOutline0.m$1("Only Category Clicked and Suggested Action Clicked should be accessible from logTapSupportFlowNode");
                return;
            }
            valueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
            Link link = ((SupportHomeViewEvent.SuggestedActionClicked) supportHomeViewEvent).link;
            Link.Target target = link.target;
            CustomerSupportAccessOpenNode.SelectedType selectedType3 = link.isMlSuggestion ? CustomerSupportAccessOpenNode.SelectedType.ML_SUGGESTED : CustomerSupportAccessOpenNode.SelectedType.SUGGESTED;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(((SupportHomeViewModel.SuggestedAction) it2.next()).link.target, target)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            Link.Target.ClientScenario clientScenario = target instanceof Link.Target.ClientScenario ? (Link.Target.ClientScenario) target : null;
            String str6 = clientScenario != null ? clientScenario.stringRepresentation : null;
            Link.Target.External external = target instanceof Link.Target.External ? (Link.Target.External) target : null;
            if (external == null || (str2 = external.url) == null) {
                Link.Target.ClientRoute clientRoute = target instanceof Link.Target.ClientRoute ? (Link.Target.ClientRoute) target : null;
                str2 = clientRoute != null ? clientRoute.url : null;
            }
            str3 = link.token;
            str4 = str6;
            selectedType = selectedType3;
            str5 = str2;
        }
        analytics.track(new CustomerSupportAccessOpenNode(str4, str5, data.flowToken, str3, selectedType, valueOf, num, Integer.valueOf((list2 == null ? EmptyList.INSTANCE : list2).size() + (list == null ? EmptyList.INSTANCE : list).size()), CustomerSupportAccessOpenNode.Trigger.HOME, data.paymentToken, str, 1024), null);
    }

    public static final void logTapSupportPhone(Analytics analytics, SupportPhoneStatus supportPhoneStatus, SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen) {
        supportPhoneStatus.getClass();
        supportHomeScreen.getClass();
        Channel channel = Channel.CALLBACK;
        SupportScreens.FlowScreens.Data data = supportHomeScreen.data;
        analytics.track(new CustomerSupportContactStart(channel, data.flowToken, CustomerSupportContactStart.Trigger.HOME, data.paymentToken, Logger.ROOT_LOGGER_NAME, null, ColumnKt.getChannelAvailability(supportPhoneStatus), ColumnKt.getChannelStatus(supportPhoneStatus), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE), null);
    }

    public static final void logViewContactOptions(Analytics analytics, SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen, String str, CustomerSupportAccessViewContactOptions.Option option, CustomerSupportAccessViewContactOptions.Option option2) {
        supportHomeScreen.getClass();
        str.getClass();
        analytics.track(new CustomerSupportAccessViewContactOptions(supportHomeScreen.data.flowToken, supportHomeScreen.nodeToken, str, CustomerSupportAccessViewContactOptions.Trigger.HOME, option, option2, CustomerSupportAccessViewContactOptions.Option.NOT_SHOWN), null);
    }

    public static void outputSubtitleEvent(Subtitle subtitle, int i, Consumer consumer) {
        long eventTime = subtitle.getEventTime(i);
        List cues = subtitle.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i == subtitle.getEventTimeCount() - 1) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        long eventTime2 = subtitle.getEventTime(i + 1) - subtitle.getEventTime(i);
        if (eventTime2 > 0) {
            consumer.accept(new CuesWithTiming(eventTime, eventTime2, cues));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void toCuesWithTiming(Subtitle subtitle, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        int nextEventTimeIndex;
        boolean z;
        int i;
        long j = outputOptions.startTimeUs;
        if (j == -9223372036854775807L) {
            nextEventTimeIndex = 0;
        } else {
            nextEventTimeIndex = subtitle.getNextEventTimeIndex(j);
            if (nextEventTimeIndex == -1) {
                nextEventTimeIndex = subtitle.getEventTimeCount();
            }
            if (nextEventTimeIndex > 0 && subtitle.getEventTime(nextEventTimeIndex - 1) == j) {
                nextEventTimeIndex--;
            }
        }
        if (j != -9223372036854775807L && nextEventTimeIndex < subtitle.getEventTimeCount()) {
            List cues = subtitle.getCues(j);
            long eventTime = subtitle.getEventTime(nextEventTimeIndex);
            if (!cues.isEmpty()) {
                long j2 = outputOptions.startTimeUs;
                if (j2 < eventTime) {
                    consumer.accept(new CuesWithTiming(j2, eventTime - j2, cues));
                    z = true;
                    for (i = nextEventTimeIndex; i < subtitle.getEventTimeCount(); i++) {
                        outputSubtitleEvent(subtitle, i, consumer);
                    }
                    if (outputOptions.outputAllCues) {
                        return;
                    }
                    if (z) {
                        nextEventTimeIndex--;
                    }
                    for (int i2 = 0; i2 < nextEventTimeIndex; i2++) {
                        outputSubtitleEvent(subtitle, i2, consumer);
                    }
                    if (z) {
                        consumer.accept(new CuesWithTiming(subtitle.getEventTime(nextEventTimeIndex), j - subtitle.getEventTime(nextEventTimeIndex), subtitle.getCues(j)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i < subtitle.getEventTimeCount()) {
        }
        if (outputOptions.outputAllCues) {
        }
    }
}
