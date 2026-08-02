package com.mikepenz.markdown.model;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.markdown.flavours.gfm.GFMFlavourDescriptor;
import org.intellij.markdown.parser.MarkdownParser;

/* loaded from: classes4.dex */
public final class Input {
    public final String content;
    public final GFMFlavourDescriptor flavour;
    public final MarkdownParser parser;
    public final ReferenceLinkHandlerImpl referenceLinkHandler;

    public Input(String str, GFMFlavourDescriptor gFMFlavourDescriptor, MarkdownParser markdownParser, ReferenceLinkHandlerImpl referenceLinkHandlerImpl) {
        str.getClass();
        gFMFlavourDescriptor.getClass();
        markdownParser.getClass();
        referenceLinkHandlerImpl.getClass();
        this.content = str;
        this.flavour = gFMFlavourDescriptor;
        this.parser = markdownParser;
        this.referenceLinkHandler = referenceLinkHandlerImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Input.class != obj.getClass()) {
            return false;
        }
        Input input = (Input) obj;
        return Intrinsics.areEqual(this.content, input.content) && Intrinsics.areEqual(this.flavour, input.flavour) && Intrinsics.areEqual(this.parser, input.parser) && Intrinsics.areEqual(this.referenceLinkHandler, input.referenceLinkHandler);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.referenceLinkHandler.hashCode() + ((this.parser.hashCode() + ((this.flavour.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(true) * 31, 31, this.content)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Input(content=" + this.content + ", lookupLinks=true, flavour=" + this.flavour + ", parser=" + this.parser + ", referenceLinkHandler=" + this.referenceLinkHandler + ", retainState=true)";
    }
}
