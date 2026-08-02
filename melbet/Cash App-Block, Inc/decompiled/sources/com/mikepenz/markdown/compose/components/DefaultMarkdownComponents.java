package com.mikepenz.markdown.compose.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes9.dex */
public final class DefaultMarkdownComponents {
    public final Function3 blockQuote;
    public final Function3 checkbox;
    public final Function3 codeBlock;
    public final Function3 codeFence;
    public final Function3 eol;
    public final Function3 heading1;
    public final Function3 heading2;
    public final Function3 heading3;
    public final Function3 heading4;
    public final Function3 heading5;
    public final Function3 heading6;
    public final Function3 horizontalRule;
    public final Function3 image;
    public final Function3 inlineImage;
    public final Function3 orderedList;
    public final Function3 paragraph;
    public final Function3 setextHeading1;
    public final Function3 setextHeading2;
    public final Function3 table;
    public final Function3 text;
    public final Function3 unorderedList;

    public DefaultMarkdownComponents(Function3 function3, Function3 function32, Function3 function33, Function3 function34, Function3 function35, Function3 function36, Function3 function37, Function3 function38, Function3 function39, Function3 function310, Function3 function311, Function3 function312, Function3 function313, Function3 function314, Function3 function315, Function3 function316, Function3 function317, Function3 function318, Function3 function319, Function3 function320, Function3 function321) {
        this.text = function3;
        this.eol = function32;
        this.codeFence = function33;
        this.codeBlock = function34;
        this.heading1 = function35;
        this.heading2 = function36;
        this.heading3 = function37;
        this.heading4 = function38;
        this.heading5 = function39;
        this.heading6 = function310;
        this.setextHeading1 = function311;
        this.setextHeading2 = function312;
        this.blockQuote = function313;
        this.paragraph = function314;
        this.orderedList = function315;
        this.unorderedList = function316;
        this.image = function317;
        this.inlineImage = function318;
        this.horizontalRule = function319;
        this.table = function320;
        this.checkbox = function321;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultMarkdownComponents)) {
            return false;
        }
        DefaultMarkdownComponents defaultMarkdownComponents = (DefaultMarkdownComponents) obj;
        return this.text.equals(defaultMarkdownComponents.text) && this.eol.equals(defaultMarkdownComponents.eol) && this.codeFence.equals(defaultMarkdownComponents.codeFence) && this.codeBlock.equals(defaultMarkdownComponents.codeBlock) && this.heading1.equals(defaultMarkdownComponents.heading1) && this.heading2.equals(defaultMarkdownComponents.heading2) && this.heading3.equals(defaultMarkdownComponents.heading3) && this.heading4.equals(defaultMarkdownComponents.heading4) && this.heading5.equals(defaultMarkdownComponents.heading5) && this.heading6.equals(defaultMarkdownComponents.heading6) && this.setextHeading1.equals(defaultMarkdownComponents.setextHeading1) && this.setextHeading2.equals(defaultMarkdownComponents.setextHeading2) && this.blockQuote.equals(defaultMarkdownComponents.blockQuote) && this.paragraph.equals(defaultMarkdownComponents.paragraph) && this.orderedList.equals(defaultMarkdownComponents.orderedList) && this.unorderedList.equals(defaultMarkdownComponents.unorderedList) && this.image.equals(defaultMarkdownComponents.image) && this.inlineImage.equals(defaultMarkdownComponents.inlineImage) && this.horizontalRule.equals(defaultMarkdownComponents.horizontalRule) && this.table.equals(defaultMarkdownComponents.table) && this.checkbox.equals(defaultMarkdownComponents.checkbox);
    }

    public final int hashCode() {
        return Recorder$$ExternalSyntheticOutline1.m(this.checkbox, Recorder$$ExternalSyntheticOutline1.m(this.table, Recorder$$ExternalSyntheticOutline1.m(this.horizontalRule, Recorder$$ExternalSyntheticOutline1.m(this.inlineImage, Recorder$$ExternalSyntheticOutline1.m(this.image, Recorder$$ExternalSyntheticOutline1.m(this.unorderedList, Recorder$$ExternalSyntheticOutline1.m(this.orderedList, Recorder$$ExternalSyntheticOutline1.m(this.paragraph, Recorder$$ExternalSyntheticOutline1.m(this.blockQuote, Recorder$$ExternalSyntheticOutline1.m(this.setextHeading2, Recorder$$ExternalSyntheticOutline1.m(this.setextHeading1, Recorder$$ExternalSyntheticOutline1.m(this.heading6, Recorder$$ExternalSyntheticOutline1.m(this.heading5, Recorder$$ExternalSyntheticOutline1.m(this.heading4, Recorder$$ExternalSyntheticOutline1.m(this.heading3, Recorder$$ExternalSyntheticOutline1.m(this.heading2, Recorder$$ExternalSyntheticOutline1.m(this.heading1, Recorder$$ExternalSyntheticOutline1.m(this.codeBlock, Recorder$$ExternalSyntheticOutline1.m(this.codeFence, Recorder$$ExternalSyntheticOutline1.m(this.eol, this.text.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "DefaultMarkdownComponents(text=" + this.text + ", eol=" + this.eol + ", codeFence=" + this.codeFence + ", codeBlock=" + this.codeBlock + ", heading1=" + this.heading1 + ", heading2=" + this.heading2 + ", heading3=" + this.heading3 + ", heading4=" + this.heading4 + ", heading5=" + this.heading5 + ", heading6=" + this.heading6 + ", setextHeading1=" + this.setextHeading1 + ", setextHeading2=" + this.setextHeading2 + ", blockQuote=" + this.blockQuote + ", paragraph=" + this.paragraph + ", orderedList=" + this.orderedList + ", unorderedList=" + this.unorderedList + ", image=" + this.image + ", inlineImage=" + this.inlineImage + ", horizontalRule=" + this.horizontalRule + ", table=" + this.table + ", checkbox=" + this.checkbox + ", custom=null)";
    }
}
