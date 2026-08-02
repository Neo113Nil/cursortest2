package com.squareup.cash.money.applets.sections;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.viewmodels.api.Section;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class AppletTileSection implements Section {
    public final /* synthetic */ int $r8$classId;
    public final Object appletTileItems;
    public final Object header;
    public final SectionId id;
    public final Object layout;

    public AppletTileSection(SectionId sectionId, String str, List list) {
        this.$r8$classId = 2;
        str.getClass();
        list.getClass();
        this.layout = str;
        this.appletTileItems = list;
        this.id = sectionId;
        this.header = new Section.Layout.VerticalStack(new Dp(RecyclerView.DECELERATION_RATE), null, 5);
    }

    @Override // com.squareup.cash.money.viewmodels.api.Section
    public final SectionId getId() {
        int i = this.$r8$classId;
        return this.id;
    }

    @Override // com.squareup.cash.money.viewmodels.api.Section
    public final Section.Layout getLayout() {
        int i = this.$r8$classId;
        Object obj = this.header;
        switch (i) {
        }
        return (Section.Layout.VerticalStack) obj;
    }

    @Override // com.squareup.cash.money.viewmodels.api.Section
    public final Section.Header header() {
        int i = this.$r8$classId;
        Object obj = this.appletTileItems;
        Object obj2 = this.layout;
        switch (i) {
            case 0:
                if (((List) obj).isEmpty()) {
                    return null;
                }
                return (Section.Header) this.header;
            case 1:
                String str = (String) obj;
                if (((ArrayList) obj2).isEmpty() || str == null || str.length() == 0) {
                    return null;
                }
                return new Section.Header.DividerWithText(str, new PaddingValuesImpl(4.0f, 8.0f, 4.0f, 16.0f), 22);
            default:
                return new Section.Header.DividerWithText((String) obj2, null, 30);
        }
    }

    @Override // com.squareup.cash.money.viewmodels.api.Section
    public final List items() {
        int i = this.$r8$classId;
        Object obj = this.appletTileItems;
        switch (i) {
            case 0:
                return (List) obj;
            case 1:
                return (ArrayList) this.layout;
            default:
                return (List) obj;
        }
    }

    public AppletTileSection(SectionId sectionId, List list, Section.Layout layout, Section.Header header) {
        this.$r8$classId = 0;
        list.getClass();
        this.id = sectionId;
        this.appletTileItems = list;
        this.layout = layout;
        this.header = header;
    }

    public AppletTileSection(String str, ArrayList arrayList) {
        this.$r8$classId = 1;
        this.appletTileItems = str;
        this.layout = arrayList;
        this.id = SectionId.DEPOSIT;
        this.header = new Section.Layout.VerticalStack(new Dp(RecyclerView.DECELERATION_RATE), null, 5);
    }
}
