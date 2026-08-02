package com.knotapi.knot.webview.merchants;

import com.knotapi.knot.utilities.Constants;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class KnotViewClientResolver {
    public static KnotViewClient getKnotViewClient(KnotView knotView) {
        if (knotView.getBot().shouldUseFullReverse()) {
            return new FullReverseClient(knotView);
        }
        int merchantId = knotView.getBot().getMerchantId();
        if (merchantId == 3) {
            return new GithubClient(knotView);
        }
        if (merchantId == 4) {
            return new MaxClient(knotView);
        }
        if (merchantId == 2261) {
            return new EVCSClient(knotView);
        }
        if (merchantId == 2262) {
            return new CalmClient(knotView);
        }
        switch (merchantId) {
            case 15:
                return new NotionClient(knotView);
            case 17:
                return new LinkedInClient(knotView);
            case 35:
                return new SiriusXMClient(knotView);
            case 47:
                return new LowesClient(knotView);
            case 65:
                return new StateFarmClient(knotView);
            case 75:
                return new DeltaAirLineClient(knotView);
            case 80:
                return new ExpediaClient(knotView);
            case 91:
                return new RokuClient(knotView);
            case 102:
                return new CashAppClient(knotView);
            case 115:
                return new QuickBookClient(knotView);
            case 118:
                return new ShopifyClient(knotView);
            case 121:
                return new FigmaClient(knotView);
            case 127:
                return new SteamClient(knotView);
            case 140:
                return new ClassPassClient(knotView);
            case 150:
                return new CheggClient(knotView);
            case 153:
                return new VisibleClient(knotView);
            case 239:
                return new HeadSpaceClient(knotView);
            case Constants.ID_KROGER /* 370 */:
                return new KrogerClient(knotView);
            case Constants.ID_SQUARE_SPACE /* 843 */:
                return new SquareSpaceClient(knotView);
            case Constants.ID_SIMPLE_MOBILE /* 2129 */:
                return new SimpleMobileClient(knotView);
            case Constants.ID_STARZ /* 2131 */:
                return new StarzClient(knotView);
            case Constants.ID_GRAMMARLY /* 2136 */:
                return new GrammarlyClient(knotView);
            case Constants.ID_GOOGLE_MASS_SWITCHER /* 2286 */:
                return new GoogleMassSwitcherClient(knotView);
            default:
                return new KnotViewClient(knotView);
        }
    }
}
