package androidx.glance.layout;

import androidx.glance.GlanceModifier;
import androidx.glance.unit.Dimension;
import androidx.media3.muxer.AnnexBUtils;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.supportarticles.app.v1.AnalyticsTag;
import com.squareup.cash.supportarticles.app.v1.SupportLink;
import com.squareup.cash.supportarticles.app.v1.SupportLink$Target$ArticleToken;
import com.squareup.cash.supportarticles.app.v1.SupportLink$Target$ClientRoute;
import com.squareup.cash.supportarticles.app.v1.SupportLink$Target$ClientScenario;
import com.squareup.cash.supportarticles.app.v1.SupportLink$Target$Url;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class SizeModifiersKt {
    public static final GlanceModifier fillMaxSize(GlanceModifier glanceModifier) {
        return glanceModifier.then(new WidthModifier()).then(new HeightModifier(Dimension.Fill.INSTANCE));
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.VerifyMagicLink.deepLinkSpecs;
    }

    public static final Link toLink(SupportLink supportLink) {
        Link.Target clientScenario;
        supportLink.getClass();
        String str = supportLink.link_token;
        str.getClass();
        String str2 = supportLink.title_text;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String str4 = supportLink.preview_text;
        AnnexBUtils annexBUtils = supportLink.target;
        if (annexBUtils instanceof SupportLink$Target$ArticleToken) {
            clientScenario = new Link.Target.Article(((SupportLink$Target$ArticleToken) annexBUtils).value);
        } else if (annexBUtils instanceof SupportLink$Target$Url) {
            clientScenario = new Link.Target.External(((SupportLink$Target$Url) annexBUtils).value);
        } else if (annexBUtils instanceof SupportLink$Target$ClientRoute) {
            clientScenario = new Link.Target.ClientRoute(((SupportLink$Target$ClientRoute) annexBUtils).value);
        } else {
            if (!(annexBUtils instanceof SupportLink$Target$ClientScenario)) {
                if (annexBUtils == null) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            clientScenario = new Link.Target.ClientScenario(((SupportLink$Target$ClientScenario) annexBUtils).value);
        }
        List list = supportLink.analytics_tags;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnalyticsTag analyticsTag = (AnalyticsTag) it.next();
                if (Intrinsics.areEqual(analyticsTag.name, "ml-picked") && Intrinsics.areEqual(analyticsTag.value, "true")) {
                    z = true;
                    break;
                }
            }
        }
        Boolean bool = supportLink.include_in_recently_viewed;
        return new Link(str, str3, clientScenario, bool != null ? bool.booleanValue() : true, str4, z);
    }
}
