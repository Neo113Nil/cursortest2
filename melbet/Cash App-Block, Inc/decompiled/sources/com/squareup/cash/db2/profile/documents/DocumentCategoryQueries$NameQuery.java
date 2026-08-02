package com.squareup.cash.db2.profile.documents;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class DocumentCategoryQueries$NameQuery extends Query {
    public final /* synthetic */ int $r8$classId;
    public final String category_id;
    public final /* synthetic */ InstrumentQueries this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentCategoryQueries$NameQuery(InstrumentQueries instrumentQueries, String str, ProfileQueries$$ExternalSyntheticLambda4 profileQueries$$ExternalSyntheticLambda4) {
        super(profileQueries$$ExternalSyntheticLambda4);
        this.$r8$classId = 0;
        str.getClass();
        this.this$0 = instrumentQueries;
        this.category_id = str;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        switch (i) {
            case 0:
                instrumentQueries.driver.addListener(new String[]{"documentCategory"}, listener);
                break;
            case 1:
                instrumentQueries.driver.addListener(new String[]{"documentCategory"}, listener);
                break;
            default:
                instrumentQueries.driver.addListener(new String[]{"documentCategory"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        switch (i) {
            case 0:
                return instrumentQueries.driver.executeQuery(1143439141, "SELECT display_name\nFROM documentCategory\nWHERE category_id = ?", function1, 1, new RecipientQueries$$ExternalSyntheticLambda0(this, 1));
            case 1:
                return instrumentQueries.driver.executeQuery(-1039600671, "SELECT render_style\nFROM documentCategory\nWHERE category_id = ?\n AND render_style IS NOT NULL", function1, 1, new RecipientQueries$$ExternalSyntheticLambda0(this, 2));
            default:
                return instrumentQueries.driver.executeQuery(183839320, "SELECT documentCategory.entity_id, documentCategory.category_id, documentCategory.parent_category_id, documentCategory.display_name, documentCategory.display_order, documentCategory.display_date, documentCategory.render_style, documentCategory.version_data\nFROM documentCategory\nWHERE parent_category_id = ?\nORDER BY display_order ASC", function1, 1, new RecipientQueries$$ExternalSyntheticLambda0(this, 3));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                instrumentQueries.driver.removeListener(new String[]{"documentCategory"}, listener);
                break;
            case 1:
                instrumentQueries.driver.removeListener(new String[]{"documentCategory"}, listener);
                break;
            default:
                instrumentQueries.driver.removeListener(new String[]{"documentCategory"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "DocumentCategory.sq:name";
            case 1:
                return "DocumentCategory.sq:renderStyle";
            default:
                return "DocumentCategory.sq:selectForParentId";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DocumentCategoryQueries$NameQuery(InstrumentQueries instrumentQueries, String str, Function1 function1, int i) {
        super(function1);
        this.$r8$classId = i;
        this.this$0 = instrumentQueries;
        this.category_id = str;
    }
}
