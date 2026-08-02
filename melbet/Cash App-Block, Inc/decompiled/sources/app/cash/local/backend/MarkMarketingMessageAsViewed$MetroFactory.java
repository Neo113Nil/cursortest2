package app.cash.local.backend;

import app.cash.badging.api.Badger2;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import coil3.svg.internal.AndroidSvg;
import com.google.zxing.Result;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.supportarticles.app.v1.AppSupportArticleService;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.tax.service.TaxExperienceService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.coroutines.Signal;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class MarkMarketingMessageAsViewed$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final DoubleCheck badger2;
    public final DoubleCheck marketingMessageRepository;

    public /* synthetic */ MarkMarketingMessageAsViewed$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, int i) {
        this.$r8$classId = i;
        this.marketingMessageRepository = doubleCheck;
        this.badger2 = doubleCheck2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DoubleCheck doubleCheck = this.badger2;
        DoubleCheck doubleCheck2 = this.marketingMessageRepository;
        switch (i) {
            case 0:
                RealMarketingMessageRepository realMarketingMessageRepository = (RealMarketingMessageRepository) doubleCheck2.getValue();
                Badger2 badger2 = (Badger2) doubleCheck.getValue();
                realMarketingMessageRepository.getClass();
                badger2.getClass();
                return new AndroidSvg(14, realMarketingMessageRepository, badger2);
            case 1:
                AppService appService = (AppService) doubleCheck2.getValue();
                Signal signal = (Signal) doubleCheck.getValue();
                appService.getClass();
                signal.getClass();
                return new Result(26, appService, signal);
            case 2:
                AppSupportArticleService appSupportArticleService = (AppSupportArticleService) doubleCheck2.getValue();
                RealArticlesService realArticlesService = (RealArticlesService) doubleCheck.getValue();
                appSupportArticleService.getClass();
                realArticlesService.getClass();
                return new TextSetter(appSupportArticleService, realArticlesService);
            default:
                TaxExperienceService taxExperienceService = (TaxExperienceService) doubleCheck2.getValue();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) doubleCheck.getValue();
                taxExperienceService.getClass();
                featureFlagManager.getClass();
                return new ToolbarTuckTargets(taxExperienceService, featureFlagManager);
        }
    }
}
