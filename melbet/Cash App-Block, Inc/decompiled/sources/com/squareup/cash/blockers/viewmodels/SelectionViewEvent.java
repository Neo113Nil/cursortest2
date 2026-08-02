package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.api.SelectionOption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class SelectionViewEvent {

    public final class BlockerActionClick extends SelectionViewEvent {
        public final BlockerAction action;

        public BlockerActionClick(BlockerAction blockerAction) {
            blockerAction.getClass();
            this.action = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlockerActionClick) && Intrinsics.areEqual(this.action, ((BlockerActionClick) obj).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m("BlockerActionClick(action=", this.action, ")");
        }
    }

    public final class GoBack extends SelectionViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -2140706120;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* loaded from: classes5.dex */
    public final class HelpClick extends SelectionViewEvent {
        public final List helpItems;

        public HelpClick(List list) {
            list.getClass();
            this.helpItems = list;
        }
    }

    public final class HelpItemClick extends SelectionViewEvent {
        public final HelpItem helpItem;

        public HelpItemClick(HelpItem helpItem) {
            helpItem.getClass();
            this.helpItem = helpItem;
        }
    }

    /* loaded from: classes5.dex */
    public final class LinkClick extends SelectionViewEvent {
        public final String url;

        public LinkClick(String str) {
            str.getClass();
            this.url = str;
        }
    }

    public final class SelectOption extends SelectionViewEvent {
        public final SelectionOption option;

        public SelectOption(SelectionOption selectionOption) {
            selectionOption.getClass();
            this.option = selectionOption;
        }
    }
}
