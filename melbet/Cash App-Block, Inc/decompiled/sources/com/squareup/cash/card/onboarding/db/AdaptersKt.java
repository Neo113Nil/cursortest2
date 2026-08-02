package com.squareup.cash.card.onboarding.db;

import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final RecipientConfig$Adapter cardStudioAdapter = new RecipientConfig$Adapter(new WireAdapter(TouchData.ADAPTER), new WireAdapter(CardTheme.ADAPTER));
}
