package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Updater;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportUploadImageCompat;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.protos.franklin.api.FilesetUploadBlocker;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class FilesetUploadPresenter$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FilesetUploadPresenter f$0;

    public /* synthetic */ FilesetUploadPresenter$$ExternalSyntheticLambda1(FilesetUploadPresenter filesetUploadPresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = filesetUploadPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        FilesetUploadPresenter filesetUploadPresenter = this.f$0;
        switch (i) {
            case 0:
                List<FilesetUploadBlocker.FileSummary> list = filesetUploadPresenter.args.existingFiles;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (FilesetUploadBlocker.FileSummary fileSummary : list) {
                    String str = fileSummary.file_token;
                    str.getClass();
                    String str2 = fileSummary.name;
                    str2.getClass();
                    String descriptionForMimeType = filesetUploadPresenter.fileTypeDescriber.getDescriptionForMimeType(fileSummary.mime_type);
                    String str3 = fileSummary.file_token;
                    arrayList.add(new FilesetUploadViewModel.FileViewModel(str, str2, descriptionForMimeType, str3 != null ? filesetUploadPresenter.fileUploadService.m3557getUriLgIXbgg(str3) : null));
                }
                return Updater.mutableStateOf$default(arrayList);
            default:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) filesetUploadPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportUploadImageCompat.INSTANCE)).enabled());
        }
    }
}
