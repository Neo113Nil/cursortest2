package com.squareup.cash.blockers.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class FilesetUploadPresenter$Companion$StringResources {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FilesetUploadPresenter$Companion$StringResources);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.blockers_fileset_upload_invalid_large_title) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(R.string.blockers_fileset_upload_failure_message_arcade, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(R.string.blockers_fileset_upload_failure_title_arcade, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(R.string.blockers_fileset_upload_attach_button_limit_reached, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(R.string.blockers_fileset_upload_subsequent_files_attach_button, Integer.hashCode(R.string.blockers_fileset_upload_attach_button) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(R.string.blockers_fileset_upload_attach_button, R.string.blockers_fileset_upload_subsequent_files_attach_button, "StringResources(attachButtonInitialTextResId=", ", attachButtonSubsequentTextResId=", ", attachButtonLimitReachedTextResId=");
        Recorder$$ExternalSyntheticOutline1.m105m(R.string.blockers_fileset_upload_attach_button_limit_reached, R.string.blockers_fileset_upload_failure_title_arcade, ", uploadFailureTitleResId=", ", uploadFailureMessageResId=", m107m);
        return Recorder$$ExternalSyntheticOutline1.m(R.string.blockers_fileset_upload_failure_message_arcade, R.string.blockers_fileset_upload_invalid_large_title, ", validationErrorMaxFileSizeExceedTitleResId=", ")", m107m);
    }
}
