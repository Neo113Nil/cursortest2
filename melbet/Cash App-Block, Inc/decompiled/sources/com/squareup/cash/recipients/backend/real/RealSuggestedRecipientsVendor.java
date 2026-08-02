package com.squareup.cash.recipients.backend.real;

import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.db.AppConfigManager;

/* loaded from: classes6.dex */
public final class RealSuggestedRecipientsVendor {
    public final AppConfigManager appConfigManager;
    public final RealContactRepository contactRepository;

    public RealSuggestedRecipientsVendor(RealContactRepository realContactRepository, AppConfigManager appConfigManager) {
        this.contactRepository = realContactRepository;
        this.appConfigManager = appConfigManager;
    }
}
